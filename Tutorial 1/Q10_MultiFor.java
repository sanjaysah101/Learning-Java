/* 
Rearrange this code to get desired output. (Feel free to add as many of curly braces as you need)
x++;
if(x==1) {
System.out.println(x+" "+y);
Class MultiFor {
for(int y=4;y>2;y--){
for(int x=0;x<4;x++) {
Public static void main(String [] args){
Output
0 4
0 3
1 4
1 3
3 4
3 3

*/


class Q10_MultiFor {
    public static void main(String[] args){
        for(int x = 0; x < 4; x++) {
            for(int y=4; y>2; y--){
                System.out.println(x+" "+y);
            }
            if(x==1) {
                x++;
            }
        }
    }
}