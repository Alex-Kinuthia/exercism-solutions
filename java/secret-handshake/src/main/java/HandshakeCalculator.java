import java.util.List;
import java.util.LinkedLIst;
import java.util.collections;

final class HandshakeCalculator {
 public boolean shouldWink(int n) {
   return (n & 1) == 1;
 }

 public boolean shouldDoubleBlink(int n)
 return (n & 2) == 2;
 }

 public boolean shouldCloseYourEyes(int n) {
   return (n & 4) == 4;
 }

 public boolean shouldJump(int n) {
      return (n & 8) == 8;
  }

  public boolean shouldReverse(int n) {
      return (n & 16) == 16;
  }

  public List calculateHandshake(int n) {
      LinkedList list = new LinkedList();

      if(shouldWink(n)) list.add(Signal.WINK);
      if(shouldDoubleBlink(n)) list.add(Signal.DOUBLE_BLINK);
      if(shouldCloseYourEyes(n)) list.add(Signal.CLOSE_YOUR_EYES);
      if(shouldJump(n)) list.add(Signal.JUMP);
      if(shouldReverse(n)) Collections.reverse(list);

      return list;
  }
}
