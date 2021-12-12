# -- coding: utf-8 --
a = -1
n = 0
m = 0
x = int(input("Введите число: "))
while x != 0:
    if a == x:
        n += 1
    else:
        a = x
        m = max(m, n)
        n = 1
    x = int(input("Введите число: "))
m = max(m, n)
print(m)