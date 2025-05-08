#include <iostream>

using namespace std;

int main() 
{
    int choice, a, b;

    while (true) 
	{
        cout << "Calculator Menu:" << endl;
        cout << "1. Addition" << endl;
        cout << "2. Subtraction" << endl;
        cout << "3. Multiplication" << endl;
        cout << "4. Division" << endl;
        cout << "5. Exit" << endl;

        cout << "Select an option (1-5): ";
        cin >> choice;

        if (choice == 5)
		 {
            cout << "Exiting the program." << endl;
            break;
        }

        cout << "Enter first number: ";
        cin >> a;
        cout << "Enter second number: ";
        cin >> b;

        if (choice == 1)
		 {
            cout << "Result: " << a + b << endl;
        }
        if (choice == 2)
		 {
            cout << "Result: " << a - b << endl;
        }
        if (choice == 3) 
		{
            cout << "Result: " << a * b << endl;
        }
        if (choice == 4) 
		{
            if (b != 0) 
			{
                cout << "Result: " << a / b << endl;
            } else
			 {
                cout << "Error: Cannot divide by zero." << endl;
            }
        }
        
        if (choice < 1 || choice > 4) 
		{
            cout << "Invalid choice. Try again." << endl;
        }
    }

    return 0;
}
