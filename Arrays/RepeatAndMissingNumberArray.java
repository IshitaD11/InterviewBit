package InterviewBit.InterviewBit.Arrays;

import java.util.ArrayList;
import java.util.List;

public class RepeatAndMissingNumberArray {
    public static void main(String[] args) {
        // ArrayList<Integer> list = new ArrayList<>(List.of(3,1,2,5,3));
        // ArrayList<Integer> list = new ArrayList<>(List.of(389, 299, 65, 518, 361, 103, 342, 406, 24, 79, 192, 181, 178, 205, 38, 298, 218, 143, 446, 324, 82, 41, 312, 166, 252, 59, 91, 6, 248, 395, 157, 332, 352, 57, 106, 246, 506, 261, 16, 470, 224, 228, 286, 121, 193, 241, 203, 36, 264, 234, 386, 471, 225, 466, 81, 58, 253, 468, 31, 197, 15, 282, 334, 171, 358, 209, 213, 158, 355, 243, 75, 411, 43, 485, 291, 270, 25, 100, 194, 476, 70, 402, 403, 109, 322, 421, 313, 239, 327, 238, 257, 433, 254, 328, 163, 436, 520, 437, 392, 199, 63, 482, 222, 500, 454, 84, 265, 508, 416, 141, 447, 258, 384, 138, 47, 156, 172, 319, 137, 62, 85, 154, 97, 18, 360, 244, 272, 93, 263, 262, 266, 290, 369, 357, 176, 317, 383, 333, 204, 56, 521, 502, 326, 353, 469, 455, 190, 393, 453, 314, 480, 189, 77, 129, 439, 139, 441, 443, 351, 528, 182, 101, 501, 425, 126, 231, 445, 155, 432, 418, 95, 375, 376, 60, 271, 74, 11, 419, 488, 486, 54, 460, 321, 341, 174, 408, 131, 115, 107, 134, 448, 532, 292, 289, 320, 14, 323, 61, 481, 371, 151, 385, 325, 472, 44, 335, 431, 187, 51, 88, 105, 145, 215, 122, 162, 458, 52, 496, 277, 362, 374, 26, 211, 452, 130, 346, 10, 315, 459, 92, 531, 467, 309, 34, 281, 478, 477, 136, 519, 196, 240, 12, 288, 302, 119, 356, 503, 527, 22, 27, 55, 343, 490, 127, 444, 308, 354, 278, 497, 191, 294, 117, 1, 396, 125, 148, 285, 509, 208, 382, 297, 405, 245, 5, 330, 311, 133, 274, 275, 118, 463, 504, 39, 99, 442, 337, 169, 140, 104, 373, 221, 499, 413, 124, 510, 159, 465, 80, 276, 83, 329, 524, 255, 387, 259, 397, 491, 517, 23, 4, 230, 48, 349, 412, 142, 114, 487, 381, 164, 35, 67, 498, 73, 440, 108, 226, 96, 132, 144, 207, 235, 33, 69, 128, 236, 364, 198, 475, 173, 493, 150, 90, 515, 111, 68, 232, 340, 112, 526, 492, 512, 495, 429, 146, 336, 17, 350, 251, 7, 184, 76, 380, 359, 293, 19, 49, 345, 227, 212, 430, 89, 474, 279, 201, 398, 347, 273, 37, 185, 177, 102, 304, 295, 422, 94, 426, 514, 116, 183, 180, 494, 42, 305, 152, 390, 30, 247, 451, 32, 388, 331, 78, 424, 368, 394, 188, 306, 449, 8, 214, 120, 179, 280, 511, 409, 338, 153, 507, 370, 461, 217, 161, 483, 147, 242, 86, 417, 268, 71, 462, 420, 167, 513, 379, 307, 522, 435, 113, 296, 457, 525, 45, 529, 423, 427, 2, 438, 64, 316, 46, 40, 13, 516, 367, 233, 110, 318, 250, 283, 216, 186, 310, 237, 377, 365, 175, 479, 378, 66, 414, 473, 165, 210, 50, 348, 372, 363, 339, 20, 168, 284, 415, 505, 206, 53, 223, 434, 202, 123, 399, 400, 135, 269, 428, 219, 456, 28, 464, 267, 489, 98, 391, 195, 366, 300, 484, 533, 229, 213, 149, 160, 256, 303, 530, 301, 29, 404, 344, 401, 220, 287, 9, 407, 170, 450, 523, 249, 72, 410, 3, 21, 200, 260));
        ArrayList<Integer> list = new ArrayList<>(List.of(873, 854, 355, 178, 157, 730, 97, 264, 376, 129, 721, 361, 298, 734, 797, 905, 570, 811, 289, 415, 120, 295, 100, 575, 895, 554, 810, 537, 47, 388, 770, 702, 643, 510, 197, 649, 500, 751, 596, 755, 871, 217, 456, 26, 567, 200, 571, 578, 93, 365, 114, 484, 657, 875, 620, 223, 110, 498, 35, 597, 740, 73, 565, 331, 845, 861, 725, 160, 343, 808, 61, 453, 743, 428, 242, 299, 358, 278, 434, 535, 460, 637, 209, 229, 586, 327, 172, 102, 585, 249, 256, 795, 658, 13, 161, 706, 450, 219, 594, 146, 470, 798, 720, 443, 850, 830, 62, 558, 192, 712, 448, 576, 214, 250, 45, 767, 257, 713, 336, 817, 87, 269, 305, 538, 849, 497, 346, 483, 841, 882, 411, 869, 339, 822, 121, 781, 136, 455, 568, 540, 247, 198, 679, 398, 206, 610, 324, 372, 403, 858, 70, 676, 27, 150, 42, 236, 439, 354, 891, 884, 1, 412, 99, 123, 878, 901, 334, 639, 673, 754, 707, 78, 632, 143, 107, 436, 176, 115, 897, 363, 353, 714, 292, 508, 828, 271, 349, 287, 142, 653, 820, 521, 216, 819, 672, 226, 663, 527, 396, 463, 492, 844, 881, 645, 11, 163, 898, 762, 25, 446, 829, 581, 678, 782, 531, 812, 856, 642, 48, 518, 577, 465, 623, 451, 742, 266, 598, 757, 908, 855, 831, 723, 906, 475, 221, 340, 909, 345, 665, 711, 836, 386, 438, 799, 19, 168, 328, 718, 778, 660, 557, 218, 57, 479, 329, 175, 551, 588, 818, 695, 317, 76, 326, 153, 384, 211, 769, 691, 309, 561, 335, 185, 262, 49, 801, 792, 414, 622, 719, 842, 8, 480, 516, 30, 603, 501, 505, 108, 58, 539, 564, 789, 145, 761, 133, 90, 238, 880, 857, 86, 506, 119, 903, 44, 64, 397, 900, 111, 382, 95, 41, 167, 686, 654, 371, 733, 833, 59, 408, 67, 75, 459, 696, 109, 6, 807, 34, 338, 332, 224, 442, 468, 683, 137, 427, 195, 685, 559, 429, 193, 507, 259, 399, 546, 560, 39, 661, 584, 786, 134, 55, 583, 16, 627, 258, 293, 390, 866, 170, 911, 633, 81, 401, 693, 274, 630, 208, 731, 165, 860, 816, 261, 204, 670, 747, 494, 418, 694, 260, 879, 53, 310, 404, 472, 666, 381, 52, 246, 835, 330, 477, 628, 241, 135, 717, 234, 33, 84, 207, 32, 166, 671, 101, 739, 296, 722, 362, 675, 441, 784, 138, 698, 716, 748, 569, 4, 640, 794, 2, 774, 174, 89, 745, 482, 373, 215, 312, 391, 380, 267, 608, 684, 634, 159, 104, 601, 466, 846, 413, 83, 532, 321, 284, 726, 753, 839, 787, 239, 600, 430, 85, 548, 728, 885, 599, 20, 72, 664, 352, 530, 852, 88, 464, 194, 476, 282, 746, 69, 189, 43, 486, 359, 703, 452, 680, 421, 907, 124, 370, 130, 533, 624, 668, 619, 253, 356, 3, 17, 604, 614, 859, 457, 125, 473, 357, 777, 806, 394, 188, 796, 173, 467, 71, 65, 454, 213, 625, 709, 618, 662, 7, 503, 669, 752, 682, 607, 288, 407, 432, 667, 318, 574, 652, 779, 222, 768, 515, 469, 763, 409, 840, 155, 674, 286, 775, 587, 790, 402, 374, 31, 230, 422, 566, 502, 615, 803, 10, 534, 128, 513, 307, 651, 525, 699, 868, 771, 127, 865, 91, 38, 80, 117, 758, 131, 708, 543, 732, 621, 656, 910, 847, 834, 613, 383, 605, 46, 888, 837, 9, 220, 367, 105, 659, 5, 832, 144, 853, 838, 611, 872, 635, 522, 648, 202, 701, 304, 378, 517, 759, 437, 512, 351, 756, 474, 876, 772, 243, 103, 419, 899, 646, 433, 248, 700, 244, 205, 511, 360, 12, 182, 212, 710, 314, 210, 681, 490, 162, 243, 252, 379, 255, 867, 275, 268, 116, 552, 864, 609, 302, 582, 151, 148, 393, 612, 800, 737, 350, 626, 478, 440, 322, 689, 154, 821, 793, 273, 629, 196, 281, 245, 760, 572, 395, 203, 589, 301, 514, 724, 705, 741, 606, 147, 729, 447, 544, 815, 21, 285, 595, 152, 765, 791, 279, 496, 750, 491, 290, 235, 489, 139, 523, 874, 92, 316, 647, 325, 426, 240, 337, 890, 79, 809, 736, 592, 904, 406, 270, 306, 300, 814, 77, 563, 893, 191, 333, 616, 63, 499, 251, 94, 40, 183, 431, 843, 98, 788, 870, 715, 547, 573, 141, 638, 156, 400, 529, 444, 54, 29, 509, 231, 228, 199, 655, 303, 804, 313, 294, 186, 74, 461, 650, 392, 780, 389, 641, 738, 783, 233, 181, 96, 825, 232, 528, 344, 776, 827, 889, 562, 366, 51, 863, 177, 896, 892, 132, 593, 37, 887, 417, 697, 462, 149, 545, 341, 644, 308, 106, 692, 24, 579, 315, 364, 424, 416, 410, 526, 493, 602, 237, 851, 164, 445, 56, 735, 813, 555, 744, 60, 68, 190, 112, 488, 265, 487, 348, 471, 36, 277, 553, 704, 902, 504, 179, 883, 28, 184, 375, 347, 727, 113, 122, 749, 805, 280, 187, 449, 254, 66, 423, 886, 227, 617, 773, 323, 420, 590, 377, 519, 542, 320, 826, 297, 541, 894, 556, 690, 591, 118, 126, 180, 272, 291, 495, 877, 22, 385, 549, 687, 524, 485, 764, 848, 785, 766, 481, 435, 368, 550, 520, 319, 387, 536, 425, 802, 862, 23, 342, 405, 677, 82, 14, 225, 18, 169, 580, 369, 631, 636, 276, 171, 688, 158, 311, 283, 824, 263, 823, 458, 50, 140, 15));
        System.out.println(repeatedNumber(list));
    }
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public static ArrayList<Integer> repeatedNumber(final List<Integer> A) {
        //-----------Approach1----------------------//
        // XOR all elements of A and also XOR 1 to n -> there will be 2 elements left x & y
        // 1^0=1 => x will have 0 & y will have 1 or vice versa
        // find any position having set bit in the xor answer, divide all elements of array & 1 to n based on that bit position
        // add elements having set bit in x & unset bit in y
        // in x & y, all elements will be duplicate except the unique element, we will get x & y
        // now iterate over the array and identify the missing element
        
        int xor = 0;
        for(int i=0;i<A.size();i++)
            xor=xor^A.get(i);
        for(int i=1;i<=A.size();i++)
            xor=xor^i;
            
        int x=0;
        int y=0;
        int setBitPos = -1;
        
        // find the set bit in xor
        for(int i=0;i<32;i++)
        {
            if(((xor>>i)&1)==1)
            {
                setBitPos=i;
                break;
            }
        }
        
        // divide elements based on setBitPos
        for(int i=0;i<A.size();i++)
        {
            if(((A.get(i)>>setBitPos)&1)==1)
                x=x^A.get(i);
            else
                y=y^A.get(i);
        }
        
        for(int i=1;i<=A.size();i++)
        {
            if(((i>>setBitPos)&1)==1)
                x=x^i;
            else
                y=y^i;
        }
        
        ArrayList<Integer> ans = new ArrayList<>();
        // find A, not present in array
        for(int i=0;i<A.size();i++)
        {
            if(A.get(i)==x)
            {    
                ans.add(x);
                break;
            }
        }
        ans.add(y);
        if(ans.size()<2)
        {    
            ans.add(x);
        }
        return ans;
        
        //-------------Approach 2---------------------//
        // A=appears twice, B = missing element
        // eq1: sum(1 to n)=sum(A)-A+B ==> B-A = sum(1 to n) - sum(All(A))
        // eq2: prod(1 to n)=prod(All(A))*B/A ==> B = A*(prod(1 to n)/prod(All(A)))
        // now replace A of eq2 in B of eq1 ==> A*(prod(1 to n)/prod(All(A))) - A = sum(1 to n) - sum(All(A))
        // ==> A = (sum(1 to n) - sum(All(A)))/((prod(1 to n)/prod(All(A)))-1)
        // Doesnot work, precision issue
        
        // double sumDiff = 0; // B-A
        // double prodDiv = 1; // B/A
        
        // for(int i=1;i<=A.size();i++)
        // {
        //     sumDiff = sumDiff + (double)i - (double)A.get(i-1); // sum(1 to n) - sum(All(A))
        //     prodDiv = prodDiv * (double)i / (double)A.get(i-1); // prod(1 to n)/prod(All(A))
        // }

        // System.out.println(sumDiff);
        // System.out.println(prodDiv);

        // int ANum = (int)((sumDiff/(prodDiv-(double)1)));
        // int BNum = (int)(sumDiff+ANum);
        
        // ArrayList<Integer> ans = new ArrayList<>();
        // ans.add(ANum);
        // ans.add(BNum);
        // return ans; 
        
    }

}