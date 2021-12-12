#-- coding: utf-8 --
N = int(input("Введите число - "))
a = 2
s = 1
while a <= N:
    a *= 2
    s += 1
print("Показатель степени", s - 1, ", число", a // 2)