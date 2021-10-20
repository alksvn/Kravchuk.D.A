# -- coding: utf-8 --
s=str(input("Введите строку на английском   "))
s = s[:s.find('h')] + s[s.rfind('h') + 1:]
print(s)