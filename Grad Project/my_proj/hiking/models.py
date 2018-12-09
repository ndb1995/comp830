from django.db import models

# Create your models here.
class Hiking (models.Model):
    name = models.CharField(max_length = 100)
    distance = models.FloatField()
    time = models.TimeField()
    date = models.DateField()
    group_size = models.IntegerField()
    state = models.CharField(max_length = 20)

    def __str__(self):
        return self.name