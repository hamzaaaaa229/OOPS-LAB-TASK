#include <iostream>
#include <string>
using namespace std;
	class laptop
	{
		public:
			string brand;
			string model;
			int serial;
			string color;
			float price;
			double processorSpeed;
			int RAM;
			float screenSize;
			
		laptop(string b, string m, int s, string c, float p, double ps, int r, float ss) 
		{
        brand = b;
        model = m;
        serial = s;
        color = c;
        price = p;
        processorSpeed = ps;
        RAM = r;
        screenSize = ss;
		}
        
        void display()
		{
        cout << "Laptop Brand: " << brand << endl;
        cout << "Model: " << model << endl;
        cout << "Serial Number: " << serial << endl;
        cout << "Color: " << color << endl;
        cout << "Price: $" << price << endl;
        cout << "Processor Speed: " << processorSpeed << " GHz" << endl;
        cout << "RAM: " << RAM << " GB" << endl;
        cout << "Screen Size: " << screenSize << " inches" << endl;
    }
			
	};
	int main() 
	{
    laptop laptop1("Dell", "latitude 1732", 12345, "black", 999.99, 3.5, 16, 13.3);
    laptop laptop2("HP", "pavilion i5", 67890, "green", 1299.99, 3.8, 16, 15.6);
    laptop laptop3("Apple", "macbook pro", 11223, "white", 1999.99, 3.1, 32, 16.0);
    
    laptop1.display();
    laptop2.display();
    laptop3.display();

    return 0;
}
