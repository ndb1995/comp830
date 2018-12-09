from django.shortcuts import render, redirect, get_object_or_404
from django.forms import ModelForm

from .models import Hiking

class HikingForm(ModelForm):
    class Meta:
        model = Hiking
        fields = ['name', 'distance']

def hike_list(request, template_name='hiking/templates/hiking_list.html'):
    hike = Hiking.objects.all()
    data = {}
    data['object_list'] = hike
    return render(request, template_name, data)

def hike_view(request, pk, template_name='hiking/templates/hiking_detail.html'):
    hike = get_object_or_404(Hiking, pk=pk)    
    return render(request, template_name, {'object':hike})

def hike_create(request, template_name='hiking/templates/hiking_form.html'):
    form = HikingForm(request.POST or None)
    if form.is_valid():
        form.save()
        return redirect('hiking_list')
    return render(request, template_name, {'form':form})

def hike_update(request, pk, template_name='hiking/templates/hiking_form.html'):
    hike = get_object_or_404(Hiking, pk=pk)
    form = HikingForm(request.POST or None, instance=hike)
    if form.is_valid():
        form.save()
        return redirect('hiking_list')
    return render(request, template_name, {'form':form})

def hike_delete(request, pk, template_name='hiking/templates/hiking_confirm_delete.html'):
    hike = get_object_or_404(Hiking, pk=pk)    
    if request.method=='POST':
        hike.delete()
        return redirect('hiking_list')
    return render(request, template_name, {'object':hike})