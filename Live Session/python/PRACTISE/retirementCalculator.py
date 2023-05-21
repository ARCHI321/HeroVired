current_annual_income = int(input("Enter Current Annual Income : "))
current_annual_savings = int(input("Enter Current Annual Savings : "))
current_annual_expenses = int(input("Enter Current Annual Expenses : "))
current_savings_rate = int(input("Enter Current Savings Rate : "))
target_portfolio_value = int(input("Enter target Portfolio Value : "))
print(f"You can retire in : {target_portfolio_value//current_annual_savings} years")
print(f"with a savings rate of : {current_savings_rate}")
print(f"annual expenses : {current_annual_expenses}")
print(f"annual savings : {current_annual_savings}")
print(f"monthly expenses : {round(current_annual_expenses/12)}")
print(f"monthly savings : {round(current_annual_savings/12)}")



