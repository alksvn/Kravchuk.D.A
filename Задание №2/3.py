﻿# -- coding: utf-8 --
n = int(input("Введите количество минут: "))
n = n % (24 * 60)
hours = (n // 60)
minutes = (n % 60)
print(hours, ":" , minutes)

