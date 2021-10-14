# -- coding: utf-8 --
n=int(input("Введите конечное число n  "))
sum = 0
for i in range (1, n + 1):
    i = i ** 3
    sum = sum + i
print(sum)