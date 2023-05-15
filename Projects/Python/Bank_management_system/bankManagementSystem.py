import random
from datetime import date
global customers,bank_acount_ifsc,bank_account_start,acc_list,loan_id,loan_list,loan_account_start
customers = dict()
bank_acount_ifsc = "xyz0003023"
bank_account_start = bank_acount_ifsc[6:11] + bank_acount_ifsc[3:6]
loan_account_start = bank_acount_ifsc[6:11] + bank_acount_ifsc[-1:-4]
acc_list = []
loan_list = []
parameters = ["name" , "phone" , "email" ,"pan no" ]
loan_id = dict()

def generateAccountNumber():
        length = 3
        mn = pow(10,length-1)
        mx = pow(10,length) - 1
        return random.randint(mn,mx)
def printAcoountDetails(n):
        s = customers[n]
        print("Account Number : " ,s['acc_no'])
        print("Name : " ,s['name'])
        print("Phone Number : " ,s['phone'])
        print("Email : " ,s['Email'])
        print("Pan no : " ,s['Pan no'])
        print("Amount : " ,s['Amount'])
def printLoanDetails(n):
        s = loan_id[n]
        print("Loan id : ",n)
        print("Account Number : " ,s['acc_no'])
        print("Interest : " ,s['phone'])
        print("Duration : " ,s['Email'])
        print("Start Date : " ,s['Pan no'])
        print("Due Amount : " ,s['Amount'])

while(1):
    print("1. Open a new account")
    print("2. Deposit amount")
    print("3. Withdraw Amount")
    print("4. Balance Enquiry")
    print("5. Close Bank Account")
    print("6. Modify Bank Account")
    print("7. Bank customer list")
    print("8. Applying for Loan")
    
    choice = int(input("Enter your choice : "))

    if choice == 1:
        customer_name = input("Enter you name : ")
        customer_phone = input("Enter you phone number : ")
        customer_email = input("Enter you email : ")
        customer_pan = input("Enter you pan number : ")
        customer_start_amount = int(input("Enter you starting amount : "))
        acc_no = generateAccountNumber()
        while acc_no in acc_list:
            acc_no = generateAccountNumber()
        acc_list.append(acc_no)    
        customer_account_number = bank_account_start + str(acc_no)
        customers[customer_account_number] = ({"acc_no": customer_account_number, "name":customer_name , "phone":customer_phone , "Email":customer_email , "Pan no":customer_pan , "Amount":customer_start_amount}) 
        printAcoountDetails(customer_account_number)
    elif choice == 2:
        acc_no = input("Enter the account number : ")
        if acc_no in customers.keys():
            deposit_amount =  int(input("Enter you amount you want to deposit  : "))
            customers[acc_no]['Amount'] += deposit_amount
            printAcoountDetails(acc_no)
        else:
            print("No account found")
    elif choice == 3:
        acc_no = input("Enter the account number : ")
        if acc_no in customers.keys():
            deposit_amount =  int(input("Enter you amount you want to withdraw  : "))
            if customers[acc_no]['Amount'] - deposit_amount > 0:
                customers[acc_no]['Amount'] -= deposit_amount
            else:
                print("Not enough balance")    
            printAcoountDetails(acc_no)
        else:
            print("No account found")   
    elif choice == 4:
        acc_no = input("Enter the account number : ")
        if acc_no in customers.keys():
            printAcoountDetails(acc_no)
        else:
            print("No account found")       
    elif choice == 5:
        acc_no = input("Enter the account number : ")
        yes = print("Are you sure you want to close your account ? (y/n) : ")
        if yes == 'y':
            del customers[acc_no]
            print("Account Deleted")
    elif choice == 6:
        acc_no = input("Enter the account number : ")
        if acc_no in customers.keys():
            input1 = int(input("What to update - 1.Name 2.Phone 3.Email 4.pan no : "))
            if input1 > len(parameters):
               print("Wrong input\n")
            else:    
               input2 = input("Enter the updated value : ")
               parameter_chosen = parameters[input1 - 1]
               customers[acc_no][parameter_chosen] = input2
               printAcoountDetails(acc_no)
        else:
            print("No account found")  
    elif choice == 7:
        print(customers) 
    elif choice == 8:
        acc_no = input("Enter the account number : ")
        if acc_no in customers.keys():
            printLoanDetails(loan_account_number)
        else:
            loan_account_number = loan_account_start + str(acc_no)
            interest = 10
            duration = input("Enter duration : ")
            start_date = date.today()
            amount = int(input("Enter loan amount : "))
            loan_id[loan_account_number] = ({"acc_no":acc_no , "interest":interest , "duration":duration , "start_date":start_date , "amount":amount})
            printLoanDetails(loan_account_number)





