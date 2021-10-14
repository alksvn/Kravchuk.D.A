# -- coding: utf-8 --
A=int(input("Введите число А"))
B=int(input("Введите число В"))
if A>B :
    for i in range (A, B - 1 , -1):
            if i % 2 != 0:
                print (i)
else:
    print("Не удовлетворяет условию")