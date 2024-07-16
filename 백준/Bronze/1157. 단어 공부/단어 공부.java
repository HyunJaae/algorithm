import java.io.IOException;
import java.io.InputStream;

class Main{
    
    static final byte A64 = (byte)64;
    
    public static void main(String[] args) throws IOException{
        InputStream is = System.in;
        byte[] buf = new byte[1000003];
        is.read(buf);
        
        int[] cnt = new int[27];
        
        for(int i=0; buf[i]>A64; i++) cnt[buf[i]&31]++;
        
        int max_idx = 0, same_idx = 0;
        for(int i=1; i<27;i++){
            if(cnt[max_idx]<cnt[i]) max_idx = i;
            else if(cnt[max_idx]==cnt[i]) same_idx = i;
        }
        if(cnt[max_idx]==cnt[same_idx]) System.out.print('?');
        else System.out.print((char)(max_idx+64));
    }
}