#-- coding: utf-8 --
x = int(input("Введите x - "))
y = int(input("Введите y - "))
den = 1
while x < y:
    x *= 1.1
    den += 1
print("На",den,"день пробег спортсмена составит", y, "км")