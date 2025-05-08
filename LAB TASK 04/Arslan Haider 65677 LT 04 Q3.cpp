#include <iostream>
#include <vector>
#include <string>
using namespace std;
class Product {
public:
string name;
double price;
int quantity;
Product(string n, double p, int q) {
 name = n;
 price = p;
 quantity = q;
    }
double total_value() const {
    return price * quantity;
    }
};
class Inventory {
private:
vector<Product> products;
public:
void add_product(const Product& product) {
    products.push_back(product);
    }
void display_products_above_threshold(double threshold) {
        bool found = false;
for (const auto& product : products) {
        if (product.total_value() > threshold) {
            cout << "Name: " << product.name
                    << ", Price: $" << product.price
                    << ", Quantity: " << product.quantity
                    << ", Total Value: $" << product.total_value() << endl;
                found = true;
            }
        }
if (!found) {
cout << "No products exceed the threshold value." << endl;
        }
    }
};
int main() {
Inventory inventory;
for (int i = 0; i < 5; ++i) {
string name;
double price;
int quantity;
cout << "Enter the name of product " << i + 1 << ": ";
getline(cin, name);
cout << "Enter the price of " << name << ": ";
cin >> price;
cout << "Enter the quantity of " << name << ": ";
cin >> quantity;
cin.ignore();
        Product product(name, price, quantity);
        inventory.add_product(product);
    }
inventory.display_products_above_threshold(500);
    return 0;
}
