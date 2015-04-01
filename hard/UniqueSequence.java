import java.util.LinkedHashMap;
import java.util.Map;


public class UniqueSequence {

    public static void get_longest_sequence(Integer[] numbers) {
    	int max = 0;
    	int startIndex = 0;
    	
    	Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
    	for (int i = 0; i < numbers.length; i++) {
    		if (map.containsKey(numbers[i])) {
    			max = Math.max(max, map.size());
    			int index = map.get(numbers[i]);
    			
    			for (int j = startIndex; j <= index; j++) {
    				map.remove(numbers[j]);
    			}
    			startIndex = index + 1;
    			
    			map.put(numbers[i], i);
    		} else {
    			map.put(numbers[i], i);
    		}
    	}
    	
    	System.out.println(max);
    }
    
	public static void main(String[] args) {
		get_longest_sequence(new Integer[]{1, 2, 3, 3, 1, 2, 3, 6, 9, 5, 7, 7}); //7
		get_longest_sequence(new Integer[]{1, 1, 1}); //1
		get_longest_sequence(new Integer[]{2, 1, 1, 2, 5, 5});//3
		get_longest_sequence(new Integer[]{878, 916, 636, 655, 647, 383, 25, 465, 430, 874, 72, 110, 671, 111, 900, 369, 691, 201, 475, 775, 805, 193, 975, 523, 825, 342, 890, 828, 798, 714, 333, 195, 6, 757, 315, 43, 583, 65, 52, 616, 812, 511, 225, 685, 744, 103, 551, 672, 923, 888, 15, 150, 927, 71, 920, 786, 593, 754, 232, 92, 961, 743, 886, 882, 226, 75, 582, 435, 684, 275, 913, 139, 871, 403, 258, 10, 200, 572, 833, 992, 73, 842, 250, 573, 76, 862, 976, 262, 449, 67, 112, 163, 696, 720, 418, 608, 124, 790, 34, 642, 23, 184, 91, 840, 656, 206, 665, 648, 81, 426, 980, 214, 860, 545, 335, 210, 217, 479, 155, 933, 149, 187, 347, 274, 587, 260, 178, 463, 568, 838, 107, 482, 700, 115, 547, 839, 948, 520, 198, 267, 605, 411, 62, 117, 611, 470, 413, 4, 86, 137, 172, 77, 53, 561, 953, 904, 861, 437, 792, 327, 649, 787, 709, 857, 968, 257, 991, 423, 567, 902, 144, 936, 249, 324, 745, 395, 359, 970, 428, 817, 762, 116, 962, 807, 761, 848, 164, 474, 981, 325, 531, 339, 215, 159, 341, 609, 160, 311, 0, 453, 222, 16, 979, 18, 235, 280, 596, 175, 601, 142, 846, 488, 702, 293, 957, 847, 652, 409, 558, 935, 304, 627, 544, 703, 282, 460, 929, 368, 532, 302, 989, 834, 491, 384, 32, 130, 412, 502, 21, 153, 416, 536, 693, 360, 972, 883, 277, 334, 897, 638, 721, 286, 100, 844, 926, 322, 401, 381, 571, 259, 640, 268, 89, 454, 978, 424, 94, 336, 722, 800, 19, 959, 5, 132, 717, 340, 318, 880, 64, 674, 943, 468, 730, 528, 515, 632, 626, 735, 576, 858, 752, 707, 760, 595, 552, 114, 29, 753, 537, 821, 439, 578, 750, 69, 496, 614, 876, 658, 729, 836, 57, 332, 894, 832, 701, 887, 88, 708, 533, 414, 26, 837, 625, 687, 896, 243, 352, 118, 893, 493, 28, 292, 83, 60, 462, 9, 909, 706, 162, 145, 504, 263, 337, 949, 941, 361, 343, 527, 376, 749, 556, 221, 329, 548, 436, 501, 58, 791, 667, 252, 705, 519, 508, 400, 771, 830, 199, 229, 156, 391, 455, 534, 666, 478, 849, 829, 431, 208, 66, 803, 231, 287, 875, 349, 768, 690, 660, 973, 500, 301, 559, 204, 157, 930, 987, 823, 87, 664, 635, 911, 147, 255, 535, 220, 45, 20, 56, 476, 372, 202, 371, 633, 464, 8, 380, 307, 613, 242, 746, 487, 854, 808, 937, 357, 604, 814, 782, 106, 657, 906, 38, 602, 422, 355, 382, 70, 637, 254, 585, 879, 778, 622, 944, 348, 577, 271, 624, 734, 224, 564, 179, 344, 505, 457, 562, 74, 472, 728, 853, 779, 895, 738, 176, 963, 273, 869, 903, 914, 230, 438, 24, 629, 698, 785, 621, 741, 266, 458, 233, 780, 404, 291, 758, 269, 541, 386, 3, 351, 831, 639, 748, 772, 662, 11, 907, 739, 55, 283, 598, 841, 820, 610, 856, 553, 850, 387, 136, 960, 180, 374, 373, 892, 824, 646, 590, 712, 354, 209, 686, 634, 35, 689, 471, 889, 174, 234, 30, 165, 119, 459, 996, 617, 570, 801, 694, 918, 919, 350, 946, 135, 939, 12, 767, 546, 606, 429, 444, 154, 673, 512, 956, 44, 33, 681, 377, 769, 873, 921, 140, 261, 599, 469, 84, 446, 766, 934, 410, 270, 481, 59, 623, 308, 945, 554, 473, 539, 450, 864, 675, 538, 402, 169, 120, 618, 432, 971, 550, 947, 303, 189, 516, 710, 822, 526, 584, 797, 727, 284, 46, 517, 851, 815, 855, 182, 600, 670, 47, 680, 891, 131, 109, 985, 51, 843, 982, 223, 619, 394, 603, 417, 425, 955, 725, 485, 241, 813, 756, 228, 816, 881, 763, 643, 477, 445, 951, 870, 615, 316, 125, 375, 95, 503, 173, 510, 683, 783, 688, 39, 54, 168, 49, 50, 793, 207, 197, 958, 497, 569, 312, 719, 363, 127, 319, 866, 612, 346, 678, 134, 129, 588, 390, 795, 407, 158, 804, 530, 986, 256, 216, 328, 186, 305, 998, 565, 365, 406, 682, 695, 574, 802, 557, 151, 399, 977, 177, 290, 190, 954, 715, 560, 113, 247, 93, 98, 969, 356, 542, 925, 68, 185, 726, 543, 238, 983, 219, 398, 248, 484, 789, 80, 122, 514, 716, 192, 306, 294, 736, 704, 7, 885, 751, 597, 899, 456, 809, 63, 451, 524, 740, 362, 995, 212, 659, 579, 699, 737, 867, 105, 910, 669, 171, 677, 388, 364, 942, 997, 924, 507, 835, 313, 405, 692, 14, 912, 433, 630, 607, 353, 950, 240, 396, 253, 295, 494, 447, 331, 988, 419, 288, 490, 645, 818, 279, 747, 97, 773, 203, 711, 392, 13, 594, 378, 104, 31, 299, 865, 246, 448, 591, 827, 952, 276, 379, 148, 393, 42, 522, 852, 397, 495, 764, 940, 128, 440, 213, 932, 581, 713, 518, 928, 194, 509, 994, 990, 297, 138, 917, 811, 765, 61, 486, 143, 121, 236, 345, 338, 589, 586, 967, 965, 931, 884, 898, 651, 770, 676, 408, 905, 389, 794, 166, 679, 2, 370, 650, 245, 141, 300, 984, 796, 427, 819, 211, 218, 281, 922, 461, 146, 732, 663, 239, 784, 441, 443, 330, 314, 575, 993, 628, 845, 1, 272, 466, 78, 237, 170, 152, 181, 489, 415, 498, 724, 96, 529, 668, 188, 82, 321, 227, 781, 17, 859, 191, 901, 358, 420, 777, 733, 966, 317, 759, 644, 620, 974, 788, 99, 102, 183, 549, 108, 296, 566, 877, 999, 48, 563, 776, 196, 289, 938, 868, 434, 85, 323, 205, 718, 810, 755, 521, 915, 492, 592, 310, 36, 641, 731, 499, 799, 661, 385, 123, 167, 908, 133, 90, 863, 367, 872, 27, 964, 298, 467, 366, 806, 540, 326, 265, 320, 161, 723, 774, 278, 41, 22, 285, 631, 697, 480, 37, 264, 244, 442, 40, 421, 452, 525, 826, 483, 126, 251, 101, 654, 653, 555, 506, 742, 580, 309, 79, 513, 972, 1220, 1016, 1072, 1334, 210, 967, 1101, 366, 519, 1164, 524, 1139, 520, 403, 224, 803, 646, 1484, 712, 563, 101, 1013, 824, 734, 1152, 1272, 1332, 1102, 601, 689, 38, 108, 852, 174, 261, 1250, 291, 1392, 420, 1211, 832, 1422, 1273, 177, 1099, 1158, 1026, 1041, 964, 1103, 683, 334, 1095, 1129, 1119, 343, 865, 729, 784, 457, 61, 483, 1071, 546, 342, 789, 1178, 172, 388, 1101, 1230, 926, 476, 700, 1047, 1340, 868, 1301, 749, 935, 967, 1235, 802, 565, 1276, 1246, 540, 896, 594, 907, 1440, 1386, 63, 594, 816, 1274, 194, 524, 933, 558, 632, 456, 838, 911, 1477, 447, 1454, 586, 293, 1312, 1085, 302, 1481, 1147, 1359, 144, 1168, 1132, 1441, 874, 1367, 1192, 1261, 444, 746, 506, 1102, 326, 1371, 1048, 225, 123, 397, 1193, 1316, 843, 931, 667, 1042, 960, 1231, 791, 912, 61, 1273, 698, 1185, 699, 1217, 1129, 352, 781, 1448, 449, 863, 364, 621, 1368, 60, 886, 378, 1466, 750, 402, 59, 986, 750, 1354, 398, 150, 704, 218, 290, 1003, 1092, 181, 1126, 911, 1171, 1362, 932, 385, 238, 1332, 432, 1490, 1145, 766, 729, 616, 1485, 202, 448, 837, 784, 1046, 238, 229, 1120, 1186, 1323, 658, 1262, 910, 1120, 986, 1191, 1279, 1200, 1250, 1107, 318, 1125, 395, 1211, 818, 542, 990, 1030, 192, 383, 64, 311, 1263, 1079, 632, 1216, 664, 51, 1423, 1140, 1345, 746, 536, 788, 1288, 313, 861, 535, 631, 47, 858, 681, 402, 1230, 1185, 1081, 1146, 700, 1290, 1194, 609, 439, 1415, 1069, 1115, 876, 308, 142, 147, 1175, 812, 1456, 1492, 1467, 1049, 1000, 836, 464, 33, 32, 925, 572, 962, 646, 226, 140, 1032, 1362, 1114, 206, 249, 689, 592, 1102, 981, 1434, 847, 1391, 68, 70, 401, 480, 241, 904, 58, 1134, 1337, 71, 590, 182, 1183, 720, 537, 974, 736, 776, 557, 950, 639, 615, 1134, 69, 1442, 289, 1232, 523, 611, 887, 612, 864, 109, 1360, 20, 279, 186, 193, 56, 662, 632, 758, 367, 299, 1321, 1467, 961, 1406, 63, 1408, 521, 1053, 182, 1304, 1419, 1492, 548, 705, 944, 1262, 1055, 156, 643, 1303, 1254, 144, 1042, 887, 672, 1296, 1095, 456, 1128, 812, 1278, 1082, 179, 113, 1334, 498, 1470, 1283, 691, 44, 1268, 1191, 478, 673, 1295, 1079, 1096, 1152, 1341, 712, 383, 1162, 79, 1219, 156, 585, 437, 455, 1387, 62, 719, 1390, 808, 1028, 627, 561, 350, 1322, 308, 475, 1198, 174, 1415, 292, 305, 1180, 524, 516, 1437, 1433, 142, 1405, 1213, 1240, 1028, 1342, 172, 1487, 633, 1282, 1001, 125, 256, 982, 663, 1461, 905, 877, 961, 1242, 98, 67, 1044, 343, 904, 300, 1354, 1210, 518, 346, 227, 659, 269, 772, 1085, 1301, 677, 633, 1341, 1263, 1218, 1230, 1196, 597, 465, 1309, 1008, 14, 658, 1407, 1458, 10, 1085, 578, 839, 294, 346, 414, 1352, 996, 1478, 757, 1463, 586, 818, 1441, 152, 1382, 1456, 984, 1215, 78, 1322, 481, 1422, 1207, 1167, 355, 129, 921, 1129, 483, 396, 887, 307, 647, 1249, 1387, 766, 166, 1285, 786, 1380, 961, 823, 1222, 1430, 105, 1158, 399, 1442, 510, 1100, 218, 1402, 341, 59, 1038, 653, 522, 1450, 1257, 1138, 1082, 594, 1100, 117, 731, 432, 796, 11, 932, 873, 899, 1399, 366, 48, 668, 740, 664, 1072, 1308, 735, 45, 256, 1446, 342, 240, 524, 600, 612, 893, 1152, 163, 1400, 884, 498, 440, 813, 53, 709, 771, 1196, 682, 247, 1139, 1101, 1319, 468, 582, 391, 259, 691, 603, 1342, 226, 20, 64, 1427, 413, 286, 1439, 1092, 1444, 1089, 1252, 349, 1462, 560, 1367, 1144, 386, 535, 1025, 469, 1248, 798, 653, 146, 147, 468, 706, 246, 1290, 1068, 617, 1455, 1208, 1157, 598, 820, 1244, 891, 1389, 992, 463, 892, 427, 1475, 167, 659, 1446, 1009, 1222, 424, 807, 1233, 230, 1044, 393, 1095, 687, 1108, 732, 668, 231, 798, 1250, 416, 8, 584, 1132, 406, 729, 484, 936, 109, 1231, 421, 346, 1422, 884, 890, 858, 1274, 318, 267, 1094, 736, 524, 1361, 876, 380, 792, 996, 1206, 55, 289, 1123, 41, 600, 1378, 1190, 1396, 1299, 630, 1417, 452, 630, 904, 1465, 1186, 576, 103, 735, 1486, 1329, 690, 4, 897, 39, 605, 1262, 27, 792, 898, 352, 942, 1231, 886, 455, 567, 838, 1111, 1008, 867, 417, 380, 387, 443, 453, 1380, 941, 1224, 1174, 815, 817, 725, 30, 941, 1467, 1442, 739, 1237, 1261, 1397, 1230, 442, 664, 1399, 1414, 794, 980, 1166, 793, 14, 426, 450, 558, 1261, 758, 929, 477, 254, 750, 832, 1298, 802, 221, 1131, 252, 1141, 271, 593, 785, 897, 1093, 1249, 607, 631, 730, 1258, 922, 65, 1004, 538, 1105, 601, 505, 455, 605, 361, 1168, 1192, 1411, 301, 394, 205, 1415, 1068, 918, 216, 832, 349, 866, 458, 1113, 1188, 212, 440, 1389, 22, 385, 1114, 379, 1257, 253, 959, 927, 1474, 81, 1210, 1244, 268, 706, 1377, 86, 1385, 622, 945, 660, 622, 1471, 1262, 755, 64, 1074, 422, 1440, 556, 290, 1451, 996, 284, 1496, 687, 2, 1177, 1464, 551, 794, 1189, 727, 1015, 86, 677, 572, 933, 523, 636, 306, 1112, 1201, 444, 98, 894, 185, 694, 466, 1171, 398, 762, 790, 278, 175, 17, 1070, 1232, 323, 795, 1319, 1147, 1278, 934, 330, 565, 1257, 297, 254, 434, 519, 777, 95, 476, 1409, 1146, 366, 1199, 827, 392, 1352, 1191, 1309, 20, 462, 1011, 289, 722, 112, 14, 408, 1146, 798, 174, 1404, 434, 1330, 1390, 878, 112, 898, 1215, 480, 1477, 1167, 1411, 85, 39, 483, 1133, 1259, 49, 507, 506, 87, 732, 1493, 1426, 903, 1140, 1192, 699, 724, 850, 1109, 970, 1051, 1103, 1403, 641, 231, 22, 966, 48, 658, 613, 158, 324, 1183, 1141, 1399, 574, 1027, 1285, 749, 717, 351, 578, 394, 668, 1041, 345, 172, 397, 1477, 726, 902, 792, 1077, 493, 641, 110, 1032, 823, 59, 1023, 606, 792, 1059, 1100, 243, 519, 1311, 1024, 774, 882, 777, 1213, 1274, 1040, 12, 321, 627, 1434, 816, 1356, 450, 894, 219, 1232, 1199, 405, 904, 281, 1032, 734, 1206, 541, 423, 681, 1442, 837, 885, 859, 1104, 83, 367, 843, 1121, 400, 1308, 451, 820, 182, 299, 477, 609, 653, 1206, 24, 1492, 1176, 1095, 487, 1292, 271, 434, 801, 527, 1408, 541, 1380, 1178, 1205, 1063, 1405, 83, 877, 1118, 7, 1114, 809, 799, 390, 761, 111, 1110, 1380, 356, 796, 1320, 1022, 760, 999, 36, 1244, 399, 730, 526, 1051, 923, 1101, 1274, 1322, 111, 680, 603, 1436, 115, 897, 1328, 815, 20, 791, 1165, 69, 196, 76, 229, 592, 753, 1240, 634, 811, 280, 1484, 1024, 1297, 32, 349, 985, 533, 838, 346, 807, 262, 711, 834, 636, 919, 140, 1117, 762, 53, 378, 852, 1258, 670, 656, 135, 290, 1334, 760, 1227, 1433, 1442, 388, 168, 408, 115, 711, 656, 355, 364, 1453, 1206, 745, 1000, 756, 1346, 249, 971, 140, 1123, 832, 811, 134, 908, 287, 142, 1499, 1436, 365, 1159, 114, 277, 75, 935, 674, 848, 1163, 4, 683, 373, 252, 519, 1305, 1111, 1387, 1387, 318, 45, 1354, 1283, 1318, 105, 573, 95, 736, 419, 975, 48, 697, 1140, 544, 1125, 48, 345, 8, 396, 1105, 292, 1191, 278, 609, 573, 1482, 450, 599, 840, 634, 631, 167, 315, 2, 1005, 706, 1365, 1004, 969, 411, 994, 367, 397, 27, 1456, 1302, 354, 524, 1118, 673, 22, 1202, 828, 478, 46, 803, 660, 1282, 1350, 188, 878, 1171, 617, 925, 289, 1019, 661, 1230, 377, 1498, 311, 400, 1291, 303, 1004, 565, 90, 769, 1220, 851, 802, 350, 66, 780, 162, 1236, 1088, 1459, 223, 727, 983, 534, 516, 611, 1191, 403, 797, 1209, 1456, 381, 114, 719, 802, 100, 14, 586, 1282, 107, 105, 1348, 929, 1197, 1160, 85, 1268, 1110, 1151, 62, 404, 1198, 1098, 128, 1385, 1462, 1022, 386, 714, 338, 1285, 1140, 362, 1325, 14, 1334, 233, 1302, 395, 432, 871, 56, 292, 1385, 1021, 271, 383, 998, 1269, 328, 1080, 147, 769, 890, 512, 1047, 167, 1347, 1243, 845, 457, 420, 1440, 547, 915, 1292, 949, 1274, 1175, 524, 551, 283, 311, 1251, 562, 794, 187, 1330, 176, 725, 909, 821, 153, 1358, 96, 373, 1459, 1145, 191, 745, 516, 529, 521, 1046, 828, 1411, 924, 566, 430, 1127, 607, 1147, 1031, 678, 855, 346, 322, 467, 175, 557, 1176, 348, 970, 1225, 1488, 115, 908, 1194, 1342, 318, 656, 969, 491, 1310, 995, 462, 213, 1271, 813, 47, 1251, 1477, 357, 108, 1338, 883, 536, 999, 363, 1266, 829, 1417, 1428, 890, 1488, 1067, 1380, 239, 1280, 750, 848, 1172, 730, 1445, 763, 507, 1164, 1019, 1158, 593, 1378, 835, 597, 328, 229, 590, 684, 979, 1457, 988, 1036, 731, 837, 244, 321, 584, 395, 340, 875, 1149, 768, 586, 584, 529, 1175, 911, 39, 645, 547, 412, 81, 1295, 974, 413, 1241, 1207, 454, 576, 731, 946, 160, 1141, 1399, 1165, 798, 818, 869, 87, 142, 571, 334, 1205, 1326, 1291, 392, 135, 458, 350, 1189, 52, 476, 762, 1486, 178, 512, 853, 649, 888, 28, 648, 951, 335, 1323, 364, 22, 770, 1153, 914, 461, 997, 258, 65, 719, 344, 793, 861, 529, 0, 853, 87, 83, 680, 805, 195, 422, 5, 895, 888, 844, 918, 786, 773, 661, 96, 808, 429, 868, 943, 219, 698, 743, 633, 656, 508, 692, 625, 272, 974, 671, 357, 228, 585, 945, 556, 820, 889, 294, 14, 495, 956, 590, 189, 605, 255, 41, 815, 771, 885, 603, 570, 558, 407, 359, 419, 729, 374, 237, 7, 397, 52, 525, 837, 314, 902, 70, 480, 265, 106, 901, 487, 298, 387, 207, 341, 581, 705, 102, 333, 423, 969, 870, 867, 412, 108, 351, 690, 44, 694, 735, 459, 250, 39, 198, 162, 223, 484, 662, 123, 847, 932, 11, 334, 94, 749, 934, 463, 388, 33, 574, 817, 514, 390, 186, 952, 401, 271, 432, 597, 763, 860, 863, 360, 955, 809, 329, 530, 347, 757, 691, 211, 738, 222, 760, 880, 534, 865, 251, 335, 916, 923, 803, 899, 708, 417, 443, 242, 260, 308, 756, 833, 699, 670, 200, 967, 448, 594, 175, 740, 745, 348, 210, 754, 188, 732, 979, 185, 949, 42, 331, 960, 111, 584, 296, 416, 362, 830, 133, 856, 138, 410, 382, 229, 629, 53, 724, 378, 839, 147, 638, 636, 752, 6, 921, 220, 632, 376, 926, 74, 651, 849, 985, 785, 993, 996, 971, 475, 715, 758, 580, 797, 161, 361, 488, 717, 598, 579, 881, 612, 373, 711, 421, 84, 264, 54, 153, 720, 665, 652, 259, 246, 27, 239, 310, 218, 898, 57, 980, 290, 890, 326, 406, 143, 610, 445, 493, 730, 913, 959, 184, 1, 862, 624, 991, 919, 835, 751, 292, 854, 791, 559, 983, 795, 499, 616, 904, 958, 655, 131, 831, 666, 563, 933, 434, 137, 912, 961, 727, 908, 136, 149, 498, 145, 426, 557, 811, 725, 741, 206, 146, 202, 286, 592, 769, 353, 109, 409, 399, 827, 840, 261, 513, 582, 288, 257, 829, 716, 507, 938, 3, 569, 273, 736, 604, 90, 358, 117, 208, 485, 688, 706, 892, 477, 346, 790, 327, 171, 667, 168, 277, 79, 640, 669, 693, 59, 446, 386, 972, 816, 762, 547, 550, 512, 630, 511, 852, 535, 93, 375, 953, 855, 285, 968, 379, 328, 306, 197, 193, 872, 814, 878, 82, 309, 927, 81, 437, 549, 339, 843, 428, 43, 150, 196, 112, 458, 542, 486, 414, 644, 900, 679, 845, 101, 107, 441, 614, 517, 897, 293, 442, 497, 714, 85, 643, 810, 678, 465, 47, 963, 436, 526, 317, 682, 764, 541, 366, 454, 118, 284, 891, 957, 553, 29, 718, 148, 589, 312, 502, 483, 848, 657, 325, 170, 203, 32, 946, 607, 524, 876, 583, 518, 276, 56, 618, 226, 427, 457, 95, 982, 371, 34, 871, 235, 798, 179, 658, 181, 301, 30, 566, 532, 564, 753, 281, 248, 24, 127, 392, 552, 194, 71, 944, 262, 267, 608, 755, 247, 721, 268, 110, 216, 783, 766, 767, 28, 801, 519, 129, 418, 650, 954, 836, 538, 600, 615, 834, 866, 940, 523, 159, 818, 602, 315, 35, 527, 521, 225, 779, 78, 467, 545, 568, 704, 221, 164, 924, 660, 586, 88, 637, 496, 23, 561, 452, 948, 591, 76, 759, 472, 742, 995, 930, 782, 800, 61, 787, 178, 45, 641, 295, 668, 709, 998, 151, 230, 492, 994, 240, 734, 165, 824, 132, 433, 687, 503, 731, 560, 989, 491, 187, 245, 439, 490, 794, 531, 50, 696, 99, 363, 689, 92, 659, 562, 311, 464, 141, 36, 280, 60, 576, 621, 537, 368, 254, 68, 289, 776, 804, 126, 405, 17, 244, 391, 733, 180, 978, 46, 381, 322, 611, 622, 37, 639, 430, 567, 577, 67, 158, 631, 685, 384, 516, 812, 209, 121, 413, 72, 886, 505, 906, 846, 619, 350, 778, 928, 2, 49, 939, 858, 19, 105, 635, 305, 411, 455, 340, 887, 116, 628, 789, 278, 555, 157, 673, 761, 232, 882, 291, 540, 910, 554, 806, 431, 89, 142, 355, 646, 321, 330, 672, 449, 365, 134, 440, 15, 12, 962, 565, 777, 408, 857, 894, 965, 307, 122, 438, 595, 990, 494, 784, 515, 224, 450, 152, 256, 1000, 372, 395, 813, 645, 215, 623, 634, 713, 543, 338, 249, 287, 780, 389, 10, 176, 551, 947, 922, 917, 252, 169, 191, 999, 113, 774, 832, 915, 297, 144, 951, 234, 823, 160, 213, 356, 966, 722, 970, 182, 199, 992, 451, 48, 822, 227, 31, 62, 115, 976, 114, 684, 447, 728, 606, 303, 588, 737, 166, 683, 620, 241, 425, 781, 975, 883, 676, 91, 522, 536, 73, 156, 663, 869, 299, 444, 337, 509, 55, 402, 504, 214, 841, 103, 69, 544, 873, 456, 929, 653, 596, 415, 40, 677, 768, 613, 424, 403, 674, 97, 573, 984, 4, 905, 819, 238, 369, 546, 13, 796, 22, 712, 821, 25, 324, 842, 859, 139, 404, 304, 850, 578, 167, 380, 681, 489, 770, 453, 539, 64, 851, 383, 205, 274, 231, 479, 9, 884, 500, 233, 703, 746, 318, 675, 649, 104, 697, 802, 302, 130, 686, 217, 642, 506, 100, 977, 950, 747, 396, 124, 864, 470, 654, 707, 701, 601, 941, 370, 571, 911, 462, 266, 874, 336, 533, 377, 792, 700, 154, 664, 896, 120, 201, 626, 460, 476, 879, 263, 98, 343, 349, 510, 66, 155, 58, 394, 501, 482, 279, 609, 907, 548, 617, 726, 393, 192, 177, 172, 119, 332, 471, 128, 300, 18, 931, 877, 807, 420, 163, 86, 903, 875, 775, 345, 140, 599, 587, 838, 125, 77, 212, 964, 352, 51, 748, 627, 38, 364, 468, 909, 173, 593, 825, 354, 695, 400, 528, 8, 275, 282, 572, 987, 385, 342, 942, 799, 893, 174, 936, 788, 316, 204, 750, 270, 935, 481, 135, 323, 320, 920, 243, 283, 313, 828, 269, 190, 988, 744, 473, 16, 648, 367, 710, 478, 466, 937, 973, 723, 772, 80, 925, 21, 469, 435, 63, 765, 826, 319, 236, 75, 398, 575, 474, 986, 520, 702, 183, 647, 981, 253, 20, 739, 26, 972, 1220, 1016, 1072, 1334, 210, 967, 1101, 366, 519, 1164, 524, 1139, 520, 403, 224, 803, 646, 1484, 712, 563, 101, 1013, 824, 734, 1152, 1272, 1332, 1102, 601, 689, 38, 108, 852, 174, 261, 1250, 291, 1392, 420, 1211, 832, 1422, 1273, 177, 1099, 1158, 1026, 1041, 964, 1103, 683, 334, 1095, 1129, 1119, 343, 865, 729, 784, 457, 61, 483, 1071, 546, 342, 789, 1178, 172, 388, 1101, 1230, 926, 476, 700, 1047, 1340, 868, 1301, 749, 935, 967, 1235, 802, 565, 1276, 1246, 540, 896, 594, 907, 1440, 1386, 63, 594, 816, 1274, 194, 524, 933, 558, 632, 456, 838, 911, 1477, 447, 1454, 586, 293, 1312, 1085, 302, 1481, 1147, 1359, 144, 1168, 1132, 1441, 874, 1367, 1192, 1261, 444, 746, 506, 1102, 326, 1371, 1048, 225, 123, 397, 1193, 1316, 843, 931, 667, 1042, 960, 1231, 791, 912, 61, 1273, 698, 1185, 699, 1217, 1129, 352, 781, 1448, 449, 863, 364, 621, 1368, 60, 886, 378, 1466, 750, 402, 59, 986, 750, 1354, 398, 150, 704, 218, 290, 1003, 1092, 181, 1126, 911, 1171, 1362, 932, 385, 238, 1332, 432, 1490, 1145, 766, 729, 616, 1485, 202, 448, 837, 784, 1046, 238, 229, 1120, 1186, 1323, 658, 1262, 910, 1120, 986, 1191, 1279, 1200, 1250, 1107, 318, 1125, 395, 1211, 818, 542, 990, 1030, 192, 383, 64, 311, 1263, 1079, 632, 1216, 664, 51, 1423, 1140, 1345, 746, 536, 788, 1288, 313, 861, 535, 631, 47, 858, 681, 402, 1230, 1185, 1081, 1146, 700, 1290, 1194, 609, 439, 1415, 1069, 1115, 876, 308, 142, 147, 1175, 812, 1456, 1492, 1467, 1049, 1000, 836, 464, 33, 32, 925, 572, 962, 646, 226, 140, 1032, 1362, 1114, 206, 249, 689, 592, 1102, 981, 1434, 847, 1391, 68, 70, 401, 480, 241, 904, 58, 1134, 1337, 71, 590, 182, 1183, 720, 537, 974, 736, 776, 557, 950, 639, 615, 1134, 69, 1442, 289, 1232, 523, 611, 887, 612, 864, 109, 1360, 20, 279, 186, 193, 56, 662, 632, 758, 367, 299, 1321, 1467, 961, 1406, 63, 1408, 521, 1053, 182, 1304, 1419, 1492, 548, 705, 944, 1262, 1055, 156, 643, 1303, 1254, 144, 1042, 887, 672, 1296, 1095, 456, 1128, 812, 1278, 1082, 179, 113, 1334, 498, 1470, 1283, 691, 44, 1268, 1191, 478, 673, 1295, 1079, 1096, 1152, 1341, 712, 383, 1162, 79, 1219, 156, 585, 437, 455, 1387, 62, 719, 1390, 808, 1028, 627, 561, 350, 1322, 308, 475, 1198, 174, 1415, 292, 305, 1180, 524, 516, 1437, 1433, 142, 1405, 1213, 1240, 1028, 1342, 172, 1487, 633, 1282, 1001, 125, 256, 982, 663, 1461, 905, 877, 961, 1242, 98, 67, 1044, 343, 904, 300, 1354, 1210, 518, 346, 227, 659, 269, 772, 1085, 1301, 677, 633, 1341, 1263, 1218, 1230, 1196, 597, 465, 1309, 1008, 14, 658, 1407, 1458, 10, 1085, 578, 839, 294, 346, 414, 1352, 996, 1478, 757, 1463, 586, 818, 1441, 152, 1382, 1456, 984, 1215, 78, 1322, 481, 1422, 1207, 1167, 355, 129, 921, 1129, 483, 396, 887, 307, 647, 1249, 1387, 766, 166, 1285, 786, 1380, 961, 823, 1222, 1430, 105, 1158, 399, 1442, 510, 1100, 218, 1402, 341, 59, 1038, 653, 522, 1450, 1257, 1138, 1082, 594, 1100, 117, 731, 432, 796, 11, 932, 873, 899, 1399, 366, 48, 668, 740, 664, 1072, 1308, 735, 45, 256, 1446, 342, 240, 524, 600, 612, 893, 1152, 163, 1400, 884, 498, 440, 813, 53, 709, 771, 1196, 682, 247, 1139, 1101, 1319, 468, 582, 391, 259, 691, 603, 1342, 226, 20, 64, 1427, 413, 286, 1439, 1092, 1444, 1089, 1252, 349, 1462, 560, 1367, 1144, 386, 535, 1025, 469, 1248, 798, 653, 146, 147, 468, 706, 246, 1290, 1068, 617, 1455, 1208, 1157, 598, 820, 1244, 891, 1389, 992, 463, 892, 427, 1475, 167, 659, 1446, 1009, 1222, 424, 807, 1233, 230, 1044, 393, 1095, 687, 1108, 732, 668, 231, 798, 1250, 416, 8, 584, 1132, 406, 729, 484, 936, 109, 1231, 421, 346, 1422, 884, 890, 858, 1274, 318, 267, 1094, 736, 524, 1361, 876, 380, 792, 996, 1206, 55, 289, 1123, 41, 600, 1378, 1190, 1396, 1299, 630, 1417, 452, 630, 904, 1465, 1186, 576, 103, 735, 1486, 1329, 690, 4, 897, 39, 605, 1262, 27, 792, 898, 352, 942, 1231, 886, 455, 567, 838, 1111, 1008, 867, 417, 380, 387, 443, 453, 1380, 941, 1224, 1174, 815, 817, 725, 30, 941, 1467, 1442, 739, 1237, 1261, 1397, 1230, 442, 664, 1399, 1414, 794, 980, 1166, 793, 14, 426, 450, 558, 1261, 758, 929, 477, 254, 750, 832, 1298, 802, 221, 1131, 252, 1141, 271, 593, 785, 897, 1093, 1249, 607, 631, 730, 1258, 922, 65, 1004, 538, 1105, 601, 505, 455, 605, 361, 1168, 1192, 1411, 301, 394, 205, 1415, 1068, 918, 216, 832, 349, 866, 458, 1113, 1188, 212, 440, 1389, 22, 385, 1114, 379, 1257, 253, 959, 927, 1474, 81, 1210, 1244, 268, 706, 1377, 86, 1385, 622, 945, 660, 622, 1471, 1262, 755, 64, 1074, 422, 1440, 556, 290, 1451, 996, 284, 1496, 687, 2, 1177, 1464, 551, 794, 1189, 727, 1015, 86, 677, 572, 933, 523, 636, 306, 1112, 1201, 444, 98, 894, 185, 694, 466, 1171, 398, 762, 790, 278, 175, 17, 1070, 1232, 323, 795, 1319, 1147, 1278, 934, 330, 565, 1257, 297, 254, 434, 519, 777, 95, 476, 1409, 1146, 366, 1199, 827, 392, 1352, 1191, 1309, 20, 462, 1011, 289, 722, 112, 14, 408, 1146, 798, 174, 1404, 434, 1330, 1390, 878, 112, 898, 1215, 480, 1477, 1167, 1411, 85, 39, 483, 1133, 1259, 49, 507, 506, 87, 732, 1493, 1426, 903, 1140, 1192, 699, 724, 850, 1109, 970, 1051, 1103, 1403, 641, 231, 22, 966, 48, 658, 613, 158, 324, 1183, 1141, 1399, 574, 1027, 1285, 749, 717, 351, 578, 394, 668, 1041, 345, 172, 397, 1477, 726, 902, 792, 1077, 493, 641, 110, 1032, 823, 59, 1023, 606, 792, 1059, 1100, 243, 519, 1311, 1024, 774, 882, 777, 1213, 1274, 1040, 12, 321, 627, 1434, 816, 1356, 450, 894, 219, 1232, 1199, 405, 904, 281, 1032, 734, 1206, 541, 423, 681, 1442, 837, 885, 859, 1104, 83, 367, 843, 1121, 400, 1308, 451, 820, 182, 299, 477, 609, 653, 1206, 24, 1492, 1176, 1095, 487, 1292, 271, 434, 801, 527, 1408, 541, 1380, 1178, 1205, 1063, 1405, 83, 877, 1118, 7, 1114, 809, 799, 390, 761, 111, 1110, 1380, 356, 796, 1320, 1022, 760, 999, 36, 1244, 399, 730, 526, 1051, 923, 1101, 1274, 1322, 111, 680, 603, 1436, 115, 897, 1328, 815, 20, 791, 1165, 69, 196, 76, 229, 592, 753, 1240, 634, 811, 280, 1484, 1024, 1297, 32, 349, 985, 533, 838, 346, 807, 262, 711, 834, 636, 919, 140, 1117, 762, 53, 378, 852, 1258, 670, 656, 135, 290, 1334, 760, 1227, 1433, 1442, 388, 168, 408, 115, 711, 656, 355, 364, 1453, 1206, 745, 1000, 756, 1346, 249, 971, 140, 1123, 832, 811, 134, 908, 287, 142, 1499, 1436, 365, 1159, 114, 277, 75, 935, 674, 848, 1163, 4, 683, 373, 252, 519, 1305, 1111, 1387, 1387, 318, 45, 1354, 1283, 1318, 105, 573, 95, 736, 419, 975, 48, 697, 1140, 544, 1125, 48, 345, 8, 396, 1105, 292, 1191, 278, 609, 573, 1482, 450, 599, 840, 634, 631, 167, 315, 2, 1005, 706, 1365, 1004, 969, 411, 994, 367, 397, 27, 1456, 1302, 354, 524, 1118, 673, 22, 1202, 828, 478, 46, 803, 660, 1282, 1350, 188, 878, 1171, 617, 925, 289, 1019, 661, 1230, 377, 1498, 311, 400, 1291, 303, 1004, 565, 90, 769, 1220, 851, 802, 350, 66, 780, 162, 1236, 1088, 1459, 223, 727, 983, 534, 516, 611, 1191, 403, 797, 1209, 1456, 381, 114, 719, 802, 100, 14, 586, 1282, 107, 105, 1348, 929, 1197, 1160, 85, 1268, 1110, 1151, 62, 404, 1198, 1098, 128, 1385, 1462, 1022, 386, 714, 338, 1285, 1140, 362, 1325, 14, 1334, 233, 1302, 395, 432, 871, 56, 292, 1385, 1021, 271, 383, 998, 1269, 328, 1080, 147, 769, 890, 512, 1047, 167, 1347, 1243, 845, 457, 420, 1440, 547, 915, 1292, 949, 1274, 1175, 524, 551, 283, 311, 1251, 562, 794, 187, 1330, 176, 725, 909, 821, 153, 1358, 96, 373, 1459, 1145, 191, 745, 516, 529, 521, 1046, 828, 1411, 924, 566, 430, 1127, 607, 1147, 1031, 678, 855, 346, 322, 467, 175, 557, 1176, 348, 970, 1225, 1488, 115, 908, 1194, 1342, 318, 656, 969, 491, 1310, 995, 462, 213, 1271, 813, 47, 1251, 1477, 357, 108, 1338, 883, 536, 999, 363, 1266, 829, 1417, 1428, 890, 1488, 1067, 1380, 239, 1280, 750, 848, 1172, 730, 1445, 763, 507, 1164, 1019, 1158, 593, 1378, 835, 597, 328, 229, 590, 684, 979, 1457, 988, 1036, 731, 837, 244, 321, 584, 395, 340, 875, 1149, 768, 586, 584, 529, 1175, 911, 39, 645, 547, 412, 81, 1295, 974, 413, 1241, 1207, 454, 576, 731, 946, 160, 1141, 1399, 1165, 798, 818, 869, 87, 142, 571, 334, 1205, 1326, 1291, 392, 135, 458, 350, 1189, 52, 476, 762, 1486, 178, 512, 853, 649, 888, 28, 648, 951, 335, 1323, 364, 22, 770, 1153});//1002
	}

}