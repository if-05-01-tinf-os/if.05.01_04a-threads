/*
 * Copyright ©2015. Created by P. Bauer <p.bauer@htl-leonding.ac.at>, Department
 * of Informatics and Media Technique and Design, HTBLA Leonding, Limesstr. 12 - 14,
 * 4060 Leonding, AUSTRIA. All Rights Reserved. Permission to use, copy, modify,
 * and distribute this software and its documentation for educational,
 * research, and not-for-profit purposes, without fee and without a signed
 * licensing agreement, is hereby granted, provided that the above copyright
 * notice, this paragraph and the following two paragraphs appear in all
 * copies, modifications, and distributions. Contact the Head of Informatics,
 * Media Technique and Design, HTBLA Leonding, Limesstr. 12 - 14, 4060 Leonding,
 * Austria, for commercial licensing opportunities.
 *
 * IN NO EVENT SHALL HTBLA LEONDING BE  LIABLE TO ANY PARTY FOR DIRECT,
 * INDIRECT, SPECIAL, INCIDENTAL, OR CONSEQUENTIAL DAMAGES, INCLUDING LOST
 * PROFITS, ARISING OUT OF THE USE OF THIS SOFTWARE AND ITS DOCUMENTATION,
 * EVEN IF HTBLA LEONDING HAS BEEN ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 * HTBLA LEONDING SPECIFICALLY DISCLAIMS ANY WARRANTIES, INCLUDING, BUT NOT
 * LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A
 * PARTICULAR PURPOSE. THE SOFTWARE AND ACCOMPANYING DOCUMENTATION, IF ANY,
 * PROVIDED HEREUNDER IS PROVIDED "AS IS". HTBLA LEONDING HAS NO OBLIGATION
 * TO PROVIDE MAINTENANCE, SUPPORT, UPDATES, ENHANCEMENTS, OR MODIFICATIONS.
 */
package at.htlleonding.fibonacci;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author P. Bauer <p.bauer@htl-leonding.ac.at>
 */
public class FibonacciTest {
    private final int N = 45;


    @Test
    public void testFirstNumber() {

        assertEquals(1, Fibonacci.getNumberSingle(0));
        assertEquals(1, Fibonacci.getNumberSingle(1));

        assertEquals(1, Fibonacci.getNumberParallel(0));
        assertEquals(1, Fibonacci.getNumberParallel(1));
    }

    @Test
    public void testSecondNumber() {
        assertEquals(2, Fibonacci.getNumberSingle(2));
        assertEquals(2, Fibonacci.getNumberParallel(2));
    }

    @Test
    public void testThirdNumber() {
        assertEquals(3, Fibonacci.getNumberSingle(3));
        assertEquals(3, Fibonacci.getNumberParallel(3));
    }

    @Test
    public void testFourthNumber() {
        assertEquals(5, Fibonacci.getNumberSingle(4));
        assertEquals(5, Fibonacci.getNumberParallel(4));
    }

    @Test
    @Disabled
    public void testLarge() {
        assertEquals(1_836_311_903, Fibonacci.getNumberSingle(N));
        assertEquals(1_836_311_903, Fibonacci.getNumberParallel(N));
    }
}
