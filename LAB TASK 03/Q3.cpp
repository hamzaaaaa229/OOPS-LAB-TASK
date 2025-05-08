#include <iostream>
#include <string>
using namespace std;
class Book {
private:
    string title;
    float price;
public:
    Book(string t = "", float p = 0.0) : title(t), price(p) {}
void setTitle(string t) {
        title = t;
    }
void setPrice(float p) {
        price = p;
    }
string getTitle() const {
        return title;
    }
float getPrice() const {
        return price;
    }
};

int main() {
Book* books = new Book[5];
string titles[5] = {"Book 1", "Book 2", "Book 3", "Book 4", "Book 5"};
float prices[5] = {45.99, 55.50, 62.10, 30.25, 75.40};
for (int i = 0; i < 5; i++) {
        books[i].setTitle(titles[i]);
        books[i].setPrice(prices[i]);
    }
cout << "Books with prices above $50:" << endl;
for (int i = 0; i < 5; i++) {
if (books[i].getPrice() > 50) {
cout << "Title: " << books[i].getTitle() << ", Price: $" << books[i].getPrice() << endl;
        }
    }
delete[] books;
 return 0;
}
