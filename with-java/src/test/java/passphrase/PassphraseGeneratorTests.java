package passphrase;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class PassphraseGeneratorTests {

    private final List<String> lowers;
    private final List<String> uppers;
    private final List<String> numbers;

    PassphraseGeneratorTests() {
        this.lowers = Arrays.asList("a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z".split(","));
        this.uppers = Arrays.asList("A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V,W,X,Y,Z".split(","));
        this.numbers = Arrays.asList("1,2,3,4,5,6,7,8,9,0".split(","));
    }

    @Test
    public void generatePassphraseNotContainUppers(){
        String passphease = null;
        for (int i=0;i<10000;i++) {
            var passphraseGenerator = new PassphraseGenerator(true, false, true);
            passphease = passphraseGenerator.generate(1024);
            assert passphease.equals(passphease.toLowerCase());
        }
    }

    @Test
    public void generatePassphraseBySpecifiedLength(){
        var passphraseGenerator = new PassphraseGenerator(true,true,true);
        var passphease = passphraseGenerator.generate(16);
        assert passphease.length() == 16;
    }

    @Test
    public void generateEmptyWhenAllConfigIsFalse(){
        var passphraseGenerator = new PassphraseGenerator(false,false,false);
        var passphease = passphraseGenerator.generate(0);
        assert passphease.length() == 0;
    }

}
