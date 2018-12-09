from django.db import models
import datetime

# Create your models here.
class Hiking (models.Model):
    name = models.CharField(max_length = 100)
    distance = models.FloatField()
    time = models.FloatField()
    date = models.DateField(default=datetime.date.today)
    group_size = models.IntegerField()
    state = models.CharField(max_length = 20)

    def __str__(self):
        return self.name