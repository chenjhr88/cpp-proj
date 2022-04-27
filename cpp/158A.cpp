#include <iostream>

using namespace std;

int main(){
	int n,k,j,a[100000];
	j = 0;
	cin >> n >> k;
	for(int i = 0; i < n-1; i++){
		cin >> a[i];
		if(a[i] >= k){
			j++;
		}
	}
	cout << j;
	return 0;
}
