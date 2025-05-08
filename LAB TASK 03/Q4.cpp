#include <iostream>
using namespace std;
class Counter {
private:
    int count;
public:
 Counter() : count(0) {}
 int getCount() const {
        return count;
    }
void incrementByValue(Counter c) {
    c.count++;
    }
void incrementByReference(Counter &c) {
    c.count++;
    }
void incrementByPointer(Counter* c) {
    c->count++;
    }
};

int main() {
Counter c1;
cout << "Initial count (c1): " << c1.getCount() << endl;
c1.incrementByValue(c1);
cout << "After incrementByValue (c1): " << c1.getCount() << endl;
c1.incrementByReference(c1);
cout << "After incrementByReference (c1): " << c1.getCount() << endl;
c1.incrementByPointer(&c1);
cout << "After incrementByPointer (c1): " << c1.getCount() << endl;
return 0;
}
