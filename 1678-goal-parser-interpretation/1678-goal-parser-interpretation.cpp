class Solution {
public:
    string interpret(string command) {
      int N = command.length();
       string s; 
       for(int i=0;i<N;i++){
           if(command[i]=='G'){
                s.push_back('G');
           }else if(command[i] =='(' && command[i+1]==')'){
                 s.push_back('o');
           }else if(command[i] =='(' && command[i+1]=='a' && command[i+2]=='l' && command[i+3]==')'){
                 s.push_back('a');
                 s.push_back('l');
           }
       } 
      return s;  
    }
};