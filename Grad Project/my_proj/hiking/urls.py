from django.urls import path

from . import views

urlpatterns = [
    path('', views.hike_list, name='hike_list'),
    path('view/<int:pk>', views.hike_view, name='hike_view'),
    path('new', views.hike_create, name='hike_new'),
    path('edit/<int:pk>', views.hike_update, name='hike_edit'),
    path('delete/<int:pk>', views.hike_delete, name='hike_delete'),
    path('stats', views.hike_stats, name='hike_stats'),
]