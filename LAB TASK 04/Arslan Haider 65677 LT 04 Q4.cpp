#include <iostream>
#include <string>
using namespace std;
class Computer {
protected:
int word_size;
int memory_size;
int storage_size;
int speed;
public:
Computer(int ws, int mem, int stor, int spd) {
word_size = ws;
memory_size = mem;
storage_size = stor;
speed = spd;
    }
void display() {
cout << "Computer Specifications:" << endl;
cout << "Word Size: " << word_size << " bits" << endl;
cout << "Memory Size: " << memory_size << " MB" << endl;
cout << "Storage Size: " << storage_size << " MB" << endl;
cout << "Speed: " << speed << " MHz" << endl;
    }
void setSpecs(int mem, int spd) {
memory_size = mem;
speed = spd;
    }
void setSpecs(int mem, int spd, int stor) {
memory_size = mem;
speed = spd;
storage_size = stor;
    }
};
class Laptop : public Computer {
private:
double length;
double width;
double height;
double weight;
public:
Laptop(int ws, int mem, int stor, int spd, double len, double wid, double ht, double wt)
: Computer(ws, mem, stor, spd) {
length = len;
width = wid;
height = ht;
weight = wt;
    }
void display() {
Computer::display();
cout << "Laptop Specifications:" << endl;
cout << "Length: " << length << " inches" << endl;
cout << "Width: " << width << " inches" << endl;
cout << "Height: " << height << " inches" << endl;
cout << "Weight: " << weight << " kg" << endl;
    }
void setSpecs(int mem, int spd, double len, double wid, double ht, double wt) {
memory_size = mem;
speed = spd;
length = len;
width = wid;
height = ht;
weight = wt;
    }
};
int main() {
Computer myComputer(64, 8, 500, 3200);
myComputer.display();
Laptop myLaptop(64, 16, 1000, 3500, 13.3, 9.0, 0.7, 1.5);
myLaptop.display();
myLaptop.setSpecs(32, 4000, 14.0, 9.5, 0.8, 1.6);
cout << "\nUpdated Laptop Specifications:" << endl;
myLaptop.display();
 return 0;
}

