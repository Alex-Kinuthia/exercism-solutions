import java.util.List;
import java.util.LinkedList;
import java.util.Collections;

// class HandshakeCalculator
final class HandshakeCalculator {
 public boolean shouldWink(int n) {
   return (n & 1) == 1;
 }
// input of 2 shouldDoubleBlink
 public boolean shouldDoubleBlink(int n) {
 return (n & 2) == 2;
 }
// input of 4 shouldCloseYourEyes
 public boolean shouldCloseYourEyes(int n) {
   return (n & 4) == 4;
 }
// input of 8 should result to jump
 public boolean shouldJump(int n) {
      return (n & 8) == 8;
  }
// input of 16 shuld result to reverse
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
