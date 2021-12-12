#-- coding: utf-8 --
n=int(input("Введите число >=2  "))
a=int(2)
while a<=n:
    if n%a==0:
     print("Наименьший дилитель числа",n," = ",a)
     break
    else:
     a=a+1