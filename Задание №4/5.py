# -- coding: utf-8 --
s=str(input("Введите строку на английском   "))
if s.count('f') == 1:
    print(s.find('f'))
elif s.count('f') >= 2:
    print(s.find('f'), s.rfind('f'))