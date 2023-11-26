const customers = [
  { customerID: 1, customerName: "Archisman", totalBillingAmount: 2500 },
  { customerID: 2, customerName: "Ritwik", totalBillingAmount: 3500 },
  { customerID: 3, customerName: "Upalabdhi", totalBillingAmount: 4000 },
  { customerID: 4, customerName: "Rishav", totalBillingAmount: 2800 },
  { customerID: 5, customerName: "Soumyodeep", totalBillingAmount: 3800 },
  { customerID: 6, customerName: "Saikat", totalBillingAmount: 3000 },
];

function filterCustomers(customers) {
  return customers.filter((customer) => customer.totalBillingAmount > 3000);
}

function printCustomerDetails(filteredCustomers) {
  filteredCustomers.forEach((customer) => {
    console.log(`Customer Name: ${customer.customerName}`);
    console.log(`Customer ID: ${customer.customerID}`);
    console.log(`Total Billing Amount: Rs. ${customer.totalBillingAmount}`);
    console.log("---------------");
  });
}

const selectedCustomers = filterCustomers(customers);

printCustomerDetails(selectedCustomers);
