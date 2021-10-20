# -- coding: utf-8 --
s=str(input("Введите строку   "))
a=s[(len(s) + 1) // 2:] + s[:(len(s) + 1) // 2]
print(a)