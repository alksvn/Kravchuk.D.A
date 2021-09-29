age = int(input("Введите свой возраст "))
if age < 0 or age > 75 :
   print("Не удовлетворяет условию")
   
if age >0 and age < 75 and age >=16 :
    print("Поздравляем вы поступили в ВГУИТ")
    
if age >0 and age < 75 and age <16 :
    print("Сначала нужно окончить школу")
input()
