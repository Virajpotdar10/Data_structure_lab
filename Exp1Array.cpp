#include <iostream>
using namespace std;

class Array {
    int a[20]={5,15}, n;

public:
    Array() { n = 2; }

    void insert() {
        int v;
        cout << "Enter value: ";
        cin >> v;
        a[n++] = v;
    }

    void display() {
        for(int i=0;i<n;i++)
        cout <<a[i]<<" ";
    }

    void search() {
        int k;
        cout << "Enter the value to Search: ";
        cin >> k;
        for(int i=0;i<n;i++)
            if(a[i]==k) {
                cout << "Element Found at " << i+1;
                return;
            }
        cout << "Element Not Found";
    }

    void del() {
        int p;
        cout << "Enter the Position to delete the Ele.: ";
        cin >> p;
        for(int i=p-1;i<n-1;i++)
            a[i]=a[i+1];
        n--;
    }

};

int main() {
    Array arr;
    int ch;

    do {
        cout << "\n1.Insert 2.Delete 3.Display 4.Search  5.Sort 6.Exit \nChoice: ";
        cin >> ch;

        switch(ch) {
            case 1: arr.insert(); break;
            case 2: arr.del(); break;
            case 3: arr.display(); break;
            case 4: arr.search(); break;
            case 5: arr.sort();break;
        }
    } while(ch != 6);

    return 0;
}
