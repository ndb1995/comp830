# Generated by Django 2.1.4 on 2018-12-08 23:37

from django.db import migrations, models


class Migration(migrations.Migration):

    initial = True

    dependencies = [
    ]

    operations = [
        migrations.CreateModel(
            name='Hiking',
            fields=[
                ('id', models.AutoField(auto_created=True, primary_key=True, serialize=False, verbose_name='ID')),
                ('name', models.CharField(max_length=100)),
                ('distance', models.FloatField()),
                ('time', models.TimeField()),
                ('date', models.DateField()),
                ('group_size', models.IntegerField()),
                ('state', models.CharField(max_length=20)),
            ],
        ),
    ]
