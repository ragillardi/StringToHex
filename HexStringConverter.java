����   4 U
  6	  7 8
  6 9
  6
  :
  ;
  <
  =
 > ? @
  A	  B
  C D
  E F 	HEX_CHARS [C hexStringConverter !Lstring/tohex/HexStringConverter; <init> ()V Code LineNumberTable LocalVariableTable this getHexStringConverterInstance #()Lstring/tohex/HexStringConverter; StackMapTable stringToHex &(Ljava/lang/String;)Ljava/lang/String; input Ljava/lang/String; 
Exceptions G hexToString i I txtInHex 	txtInByte [B j + asHex ([B)Ljava/lang/String; buf chars  <clinit> 
SourceFile HexStringConverter.java     string/tohex/HexStringConverter java/lang/NullPointerException H I . / J K L M N O P java/lang/String  Q    R 0123456789abcdef S T java/lang/Object $java/io/UnsupportedEncodingException getBytes ()[B length ()I 	substring (II)Ljava/lang/String; java/lang/Byte 	parseByte (Ljava/lang/String;I)B ([B)V ([C)V toCharArray ()[C !           
             /     *� �                        	       9      � � � Y� � � �       
               !     V     +� � Y� �*+� � �       
                      " #       $     %  & !     �     ;+� 	l�M>6+� 	� ,�+`� 
� T���߻ Y,� �           # 	 $  %  ' , % 2 )    4   $ ' (    ;       ; ) #  	 2 * +   0 , (      �  -� #  . /     �     A+�h�M>+�� ,,h� +3 �~|4U,h`� +3~4U���Ի Y,� �           .  /  1 ! 2 2 / 8 4    *  	 / ' (    A       A 0 +   : 1       � 	 2� .  3      )      � � � �       
        4    5