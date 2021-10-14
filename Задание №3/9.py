# -- coding: utf-8 --
n = int(input("Количество чисел из ряда Фибоначе "))
f1 = 1
f2 = 2
sum = 3
for i in range(3, n+1):
    b = f1
    f1 = f2
    f2 = b+f1
    sum = sum + f2
print()
print(sum)