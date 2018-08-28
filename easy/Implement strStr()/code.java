class Solution {
    public int strStr(String sText, String sPattern) {
        
        if(sPattern.length() == 0)
            return 0;
        
        if(sText.length() < sPattern.length()) 
            return -1;
        
        if(sText.equals(sPattern))
            return 0;
        
        // Bc = bad char, Gs = good suffix
        int iBc = -1, iGs = -1;
        int imvBc, imvGs;
        int iTextLen = sText.length();
        int iPatLen = sPattern.length() - 1;
        
        int i, j;
        for(i = 0; i < iTextLen - iPatLen; ) {
            // Compare both sText and sPattern tail.
            if(sText.charAt(i + iPatLen) == sPattern.charAt(iPatLen)) {
                
                for(j = iPatLen - 1; j >= 0; j--) {
                    if((sText.charAt(i + j) == sPattern.charAt(j))) {
                    } else {
                        iBc = i + j;
                        iGs = i + iPatLen;
                        break;
                    }
                }

                // Find iPatLen in text.
                if(j < 0) {
                    return i;
                } else {
                    // calculate i of move num.
                    imvBc = mvBc(sText.charAt(iBc), sPattern.substring(0, j));
                    imvGs = mvGs(sPattern, j);
                    i +=  imvBc > imvGs ? imvBc : imvGs;
                } 
                
            } else { 
                imvBc = mvBc(sText.charAt(i + iPatLen), sPattern.substring(0, iPatLen));
                i += imvBc;
            }
            
        }
        
        return -1;
    }
    
    int mvGs(String sPattern, int iBc) {
        String sGs = sPattern.substring(iBc + 1);
        String sRepat = sPattern.substring(0, iBc);
        int iGsLen = sGs.length() - 1, iRepatLen = sRepat.length() - 1;
        
        int i, j;
        for(i = iRepatLen ; i >= 0; i--) {
            
            // match tail
            if(sGs.charAt(iGsLen) == sRepat.charAt(i)) {
                j = (i > iGsLen ? iGsLen : i) - 1;

                for (; j >= 0; j--) {
                    iGsLen--;
                    if(!(sGs.charAt(iGsLen) == sRepat.charAt(j)))
                        break;
                }
                
                if(j <= 0)
                    return sGs.length() + iRepatLen - i - 1;//mov len
            }
               
        }
        
        return sGs.length() + iRepatLen + 2;//mov all
    }
    
    int mvBc(char bc, String sPattern) {
        for(int i = sPattern.length() - 1; i >= 0; i--) {
            if(sPattern.charAt(i) == bc) 
                // find
                return sPattern.length() - i;
        }
            
        // not find
        return sPattern.length() + 1;
        
    }
 
}