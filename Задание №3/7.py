# -- coding: utf-8 --
n=int(input("Введите число n  "))
pr = 1
sum = 0 
for i in range (1, n + 1):
    pr *= i
    sum = sum + pr
print(sum)