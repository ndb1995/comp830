from django.shortcuts import render, redirect, get_object_or_404
from django.forms import ModelForm
from .models import Hiking
from django.db.models import Sum, Count
import wikipedia as wiki


# form for use with creating and updating
class HikingForm(ModelForm):
    class Meta:
        model = Hiking
        fields = ['name', 'distance', 'elevation', 'time', 'date', 'group_size', 'state']

# view every hike
def hike_list(request, template_name='hiking/templates/hiking_list.html'):
    hike = Hiking.objects.all()
    data = {}
    data['object_list'] = hike
    return render(request, template_name, data)

# view a specific hike
def hike_view(request, pk, template_name='hiking/templates/hiking_detail.html'):
    hike = get_object_or_404(Hiking, pk=pk)   
    w = wiki.summary(hike.name, sentences = 4) 
    wurl = wiki.page(hike.name)
    wurl = wurl.url
    return render(request, template_name, {'object':hike, 'wiki': w, 'wiki_url': wurl})

# create an exisiting hike
def hike_create(request, template_name='hiking/templates/hiking_form.html'):
    form = HikingForm(request.POST or None)
    if form.is_valid():
        form.save()
        return redirect('hike_list')
    return render(request, template_name, {'form':form})

# update an existing hike
def hike_update(request, pk, template_name='hiking/templates/hiking_form.html'):
    hike = get_object_or_404(Hiking, pk=pk)
    form = HikingForm(request.POST or None, instance=hike)
    if form.is_valid():
        form.save()
        return redirect('hike_list')
    return render(request, template_name, {'form':form})

# delete any previously entered hike
def hike_delete(request, pk, template_name='hiking/templates/hiking_confirm_delete.html'):
    hike = get_object_or_404(Hiking, pk=pk)    
    if request.method=='POST':
        hike.delete()
        return redirect('hike_list')
    return render(request, template_name, {'object':hike})

# get a sum of some hiking stats
def hike_stats(request, template_name='hiking/templates/hike_stats.html'):
    time = Hiking.objects.aggregate(Sum('time'))
    name = Hiking.objects.aggregate(Count('name'))
    distance = Hiking.objects.aggregate(Sum('distance'))
    elevation = Hiking.objects.aggregate(Sum('elevation'))
    data = {}
    data['time'] = time
    data['name'] = name
    data['distance'] = distance
    data['elevation'] = elevation
    return render(request, template_name, data)