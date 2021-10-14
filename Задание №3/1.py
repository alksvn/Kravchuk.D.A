# -- coding: utf-8 --
A=int(input("Введите число А"))
B=int(input("Введите число В"))
if A>B :
    print ("Не удовлетворяет условию")
else:
    for i in range (A, B + 1):
        print(i)