# -- coding: utf-8 --
N = int(input("Количество чисел из ряда Фибоначе "))
K = int(input("Порядковый номер в ряду, с которого нужно начать "))
f1 = 1
f2 = 2
sum = K
for i in range(3, N + 1):
    b = f1
    f1 = f2
    f2 = b+f1
    if i >= K:
        sum = sum + f2
print()
print(sum)