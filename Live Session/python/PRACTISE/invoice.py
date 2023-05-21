price_book1 = 499
price_book2 = 855
price_book3 = 645
print("Book - Introduction to Python Programming: Rs {}".format(price_book1))
print("Book - Python Libraries Cookbook:          Rs {}".format(price_book2))
print("Book - Data Science in Python:             Rs {}".format(price_book3))
print("-------------------------------------------------------------------------------")
total = price_book1 + price_book2 + price_book3
gst_percent = 12
gst = (gst_percent/100) * total
delivery = 250
print("Gst : {}%                                  Rs {}".format(gst_percent,gst))
print("Delivery charges :                         Rs {}".format(delivery))
altotal = total + gst + delivery
print("-------------------------------------------------------------------------------")
print("Total :                                    Rs {}".format(altotal))