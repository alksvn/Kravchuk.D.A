#-- coding: utf-8 --
from tkinter import *  
from tkinter import ttk
from tkinter import scrolledtext  
  
  
window = Tk()  
window.title("Задание №6")  
window.geometry('1200x400') 
 
tab_control = ttk.Notebook(window)  
tab1 = ttk.Frame(tab_control)  
tab2 = ttk.Frame(tab_control)
tab3 = ttk.Frame(tab_control)  
tab4 = ttk.Frame(tab_control)  
tab5 = ttk.Frame(tab_control)  
tab6 = ttk.Frame(tab_control)  
tab7 = ttk.Frame(tab_control)  
tab8 = ttk.Frame(tab_control)
    
tab_control.add(tab1, text='Задание 1')  
tab_control.add(tab2, text='Задание 2')
tab_control.add(tab3, text='Задание 3')  
tab_control.add(tab4, text='Задание 4')
tab_control.add(tab5, text='Задание 5')  
tab_control.add(tab6, text='Задание 6')
tab_control.add(tab7, text='Задание 7')  
tab_control.add(tab8, text='Задание 8')

def p1():
    N = int(txt1.get())
    i = 1
    scrtxt1.delete(1.6,END)
    while i**2 <= N:
        scrtxt1.insert(INSERT, i**2)
        scrtxt1.insert(INSERT, " ",)
        i = i+1

def p2():
    n = int(txt2.get())
    a = 2
    while a<= n:
        if n%a==0:
           scrtxt2.delete(1.38,END)
           scrtxt2.insert(INSERT, a,)
           break
        else:
            a=a+1

def p3():
    N = int(txt3.get())
    a = 2
    s = 1
    while a <= N:
        s +=1
        a *= 2
    scrtxt3.delete(1.19,END)
    scrtxt3.insert(INSERT, s-1)
    scrtxt3.insert(INSERT, "\nЧисло ")
    scrtxt3.insert(INSERT, a//2 )

def p4():
    x = int(txt4.get())
    y = int(txt4_1.get())
    den = 1
    while x < y:
        x *= 1.1
        den += 1
    scrtxt4.delete(1.5,END)
    scrtxt4.insert(INSERT, "На ")
    scrtxt4.insert(INSERT, den)
    scrtxt4.insert(INSERT, " день пробег составит ")
    scrtxt4.insert(INSERT, y)
    scrtxt4.insert(INSERT, " км")

def p5(_i=[0]):
    x = int(txt5.get())
    _i[0]+=1
    if x==0:
        scrtxt5.delete (1.33,END)
        scrtxt5.insert(INSERT, 'Количество введённых чисел = ')  
        scrtxt5.insert(INSERT, _i[0]-1)
        _i[0]=0
    txt5.delete(0,END)


def p6():
    summ=int(scrtxt6_1.get())
    dl=int(scrtxt6_2.get())
    N = int(txt6.get())
    if N != 0:
        summ += (N) 
        dl += 1
        scrtxt6_1.delete(0,'end')
        scrtxt6_1.insert (INSERT,summ)
        scrtxt6_2.delete(0,'end')
        scrtxt6_2.insert (INSERT,dl)
    else:    
        scrtxt6.delete(1.17, END)
        scrtxt6.insert (INSERT,summ/dl)
        scrtxt6_1.delete(0,'end')
        scrtxt6_2.delete(0,'end')
        scrtxt6_1.insert(0,"0")
        scrtxt6_2.insert(0,"0")
    txt6.delete(0,END)

def p7():
    pred = int(scrtxt7_1.get())
    n = int(txt7.get())
    x = int(scrtxt7_2.get())
    if n != 0:
        if n > pred:
            x += 1
            scrtxt7_2.delete(0,'end')
            scrtxt7_2.insert(0,x)
        pred = n
        scrtxt7_1.delete(0,'end')
        scrtxt7_1.insert(0,pred)
    else:
        scrtxt7.delete(1.26,END)
        scrtxt7.insert(INSERT,"Чисел больше предыдущего ")
        scrtxt7.insert(INSERT,x)
        scrtxt7_1.delete(0,'end')
        scrtxt7_2.delete(0,'end')
        scrtxt7_1.insert(0,"0")
        scrtxt7_2.insert(0,"0")    
    txt7.delete(0,END)  

def p8():
    n = int(txt8.get())
    x = int(scrtxt8_1.get())
    max = int(scrtxt8_2.get())
    if n != 0:
        if (n == x):
            max += 1
            scrtxt8_2.delete(0,"end")
            scrtxt8_2.insert(0,max)
            if max > int(scrtxt8_3.get()):
                scrtxt8_3.delete(0,'end')
                scrtxt8_3.insert(0,max)
        else: 
            scrtxt8_1.delete(0,'end')
            scrtxt8_1.insert(0,n)
            max=0
            scrtxt8_2.delete(0,"end")
            scrtxt8_2.insert(0,"0")
    else:
        mmax=int(scrtxt8_3.get())
        scrtxt8.delete(1.48,END)
        scrtxt8.insert(INSERT,"Наибольшее число чисел, идущих друг за другом =  ")
        scrtxt8.insert(INSERT,mmax)
        scrtxt8_1.delete(0,'end')
        scrtxt8_1.insert(0,"0")
        scrtxt8_2.delete(0,'end')
        scrtxt8_2.insert(0,"0")
        scrtxt8_3.delete (0,'end')
        scrtxt8_3.insert (0,'0')   
    txt8.delete(0,END)

  
lbl1 = Label(tab1, text='По данному целому числу N распечатайте все квадраты натуральных чисел, не превосходящие N, в порядке возрастания.')  
lbl1.grid(column=0, row=0)
txt1 = Entry(tab1, width=10)
txt1.grid(column=0, row=1)
bt1 = Button(tab1, text="Решить", command=p1)
bt1.grid(column=1, row=1)
scrtxt1 = scrolledtext.ScrolledText(tab1, width=60, height=10)
scrtxt1.grid(column=0, row=3)
scrtxt1.insert(INSERT, 'Ответ ')
  
lbl2 = Label(tab2, text='Дано целое число, не меньшее 2. Выведите его наименьший натуральный делитель, отличный от 1.')  
lbl2.grid(column=0, row=0)
txt2 = Entry(tab2, width=10)
txt2.grid(column=0, row=1)
bt2 = Button(tab2, text="Решить", command=p2)
bt2.grid(column=1, row=1)
scrtxt2 = scrolledtext.ScrolledText(tab2, width=60, height=10)
scrtxt2.grid(column=0, row=3)
scrtxt2.insert(INSERT, 'Наименьший натуральный делитель числа ')

lbl3 = Label(tab3, text='По данному натуральному числу N найдите наибольшую целую степень двойки, не превосходящую N. \nВыведите показатель степени и саму степень. \nОперацией возведения в степень пользоваться нельзя!')  
lbl3.grid(column=0, row=0)
txt3 = Entry(tab3, width=10)
txt3.grid(column=0, row=1)
bt3 = Button(tab3, text="Решить", command=p3)
bt3.grid(column=1, row=1)
scrtxt3 = scrolledtext.ScrolledText(tab3, width=60, height=10)
scrtxt3.grid(column=0, row=3)
scrtxt3.insert(INSERT, 'Показатель степени ')

lbl4 = Label(tab4, text='В первый день спортсмен пробежал x километров, а затем он каждый день увеличивал пробег на 10% от предыдущего значения. \nПо данному числу y определите номер дня, на который пробег спортсмена составит не менее y километров. \nПрограмма получает на вход действительные числа x и y и должна вывести одно натуральное число.')  
lbl4.grid(column=0, row=0)
txt4 = Entry(tab4, width=10)
txt4.grid(column=0, row=1)
txt4_1 = Entry(tab4, width=10)
txt4_1.grid(column=1, row=1)
bt4 = Button(tab4, text="Решить", command=p4)
bt4.grid(column=2, row=1)
scrtxt4 = scrolledtext.ScrolledText(tab4, width=40, height=5)
scrtxt4.grid(column=0, row=3)
scrtxt4.insert(INSERT, ' ')

lbl5 = Label(tab5, text='Программа получает на вход последовательность целых неотрицательных чисел, каждое число записано в отдельной строке. \nПоследовательность завершается числом 0, при считывании которого программа должна закончить свою работу \nи вывести количество членов последовательности (не считая завершающего числа 0). Числа, следующие за числом 0, считывать не нужно.')  
lbl5.grid(column=0, row=0)
txt5 = Entry(tab5, width=50)
txt5.grid(column=0, row=1)
bt5 = Button(tab5, text="Нажать", command=p5)
bt5.grid(column=2, row=1)
scrtxt5 = scrolledtext.ScrolledText(tab5, width=40, height=5)
scrtxt5.grid(column=0, row=3)
scrtxt5.insert(INSERT, '')

lbl6 = Label(tab6, text='Определите среднее значение всех элементов последовательности, завершающейся числом 0.')  
lbl6.grid(column=0, row=0)
txt6 = Entry(tab6, width=50)
txt6.grid(column=0, row=1)
bt6 = Button(tab6, text="Нажать", command=p6)
bt6.grid(column=2, row=1)
scrtxt6 = scrolledtext.ScrolledText(tab6, width=40, height=5)
scrtxt6.grid(column=0, row=3)
scrtxt6.insert(INSERT, 'Среднее значение  ')
scrtxt6_1 = Entry(tab6, width=10)
scrtxt6_2 = Entry(tab6, width=10)
scrtxt6_1.grid(column=1, row=4)
scrtxt6_2.grid(column=2, row=4)
scrtxt6_1.insert (INSERT,'0')
scrtxt6_2.insert (INSERT,'0')

lbl7 = Label(tab7, text='Последовательность состоит из натуральных чисел и завершается числом 0. \nОпределите, сколько элементов этой последовательности больше предыдущего элемента.')  
lbl7.grid(column=0, row=0)
txt7 = Entry(tab7, width=50)
txt7.grid(column=0, row=1)
bt7 = Button(tab7, text="Нажать", command=p7)
bt7.grid(column=2, row=1)
scrtxt7 = scrolledtext.ScrolledText(tab7, width=40, height=5)
scrtxt7.grid(column=0, row=3)
scrtxt7.insert(INSERT, ' ')
scrtxt7_1 = Entry(tab7, width=10)
scrtxt7_2 = Entry(tab7, width=10)
scrtxt7_1.grid(column=1, row=4)
scrtxt7_2.grid(column=2, row=4)
scrtxt7_1.insert (INSERT,'0')
scrtxt7_2.insert (INSERT,'0')

lbl8 = Label(tab8, text='Дана последовательность натуральных чисел, завершающаяся числом 0. \nОпределите, какое наибольшее число подряд идущих элементов этой последовательности равны друг другу.')  
lbl8.grid(column=0, row=0)
txt8 = Entry(tab8, width=50)
txt8.grid(column=0, row=1)
bt8 = Button(tab8, text="Нажать", command=p8)
bt8.grid(column=2, row=1)
scrtxt8 = scrolledtext.ScrolledText(tab8, width=39, height=5)
scrtxt8.grid(column=0, row=3)
scrtxt8.insert(INSERT, '')
scrtxt8_1 = Entry(tab8, width=10)
scrtxt8_2 = Entry(tab8, width=10)
scrtxt8_3 = Entry(tab8, width=10)
scrtxt8_1.grid(column=1, row=4)
scrtxt8_2.grid(column=2, row=4)
scrtxt8_3.grid(column=3, row=4)
scrtxt8_1.insert (INSERT,'0')
scrtxt8_2.insert (INSERT,'0')
scrtxt8_3.insert (INSERT,'0')
        
tab_control.pack(expand=1, fill='both')  
window.mainloop()