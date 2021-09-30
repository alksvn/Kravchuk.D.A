# -- coding: utf-8 --
second = int(input("Введите количество секунд "))
constd=86400  #кол-во сек в сутках
constch=3600  #кол-во сек в часе
constm=60     #кол-во секунд в минуте
D = second//constd
D1= second - (constd * D)  
CH = D1//constch
CH1 = CH * constch
CH2 = D1 - CH1
M = CH2//constm
M1 = M * constm
s = CH2 - M1
print( D,':', CH,':', M,':', s,)

