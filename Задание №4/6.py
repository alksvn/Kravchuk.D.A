# -- coding: utf-8 --
s=str(input("Введите строку на английском   "))
if s.count('f') == 1:
    print(-1)
elif s.count('f') < 1:
    print(-2)
else:
    print(s.find('f', s.find('f') + 1))