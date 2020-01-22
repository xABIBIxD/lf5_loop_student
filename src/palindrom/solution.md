**Lösung Palindrom**

```
public boolean isPalindrom(String text){

        text = deleteSpaces(text);
        text = text.toLowerCase();
        for(int i=0, j=text.length()-1; i<=j; i++, j--){
            if(text.charAt(i)!= text.charAt(j))
                return false;
        }
        return true;
    }

    private String deleteSpaces( String text){
        String korrigiert="";
        for(int i=0; i< text.length(); i++){
            if(text.charAt(i)!=' '){
                korrigiert = korrigiert + text.charAt(i);
            }
        }
        return korrigiert;
    }
}
```
