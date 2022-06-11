{\rtf1\ansi\ansicpg1252\cocoartf2636
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww11520\viewh8400\viewkind0
\pard\tx566\tx1133\tx1700\tx2267\tx2834\tx3401\tx3968\tx4535\tx5102\tx5669\tx6236\tx6803\pardirnatural\partightenfactor0

\f0\fs24 \cf0 import java.util.Arrays;\
\
class Solution \{\
    public long solution(long n) \{\
        long answer = 0;\
        int nLength = (int)Math.log10(n) + 1;\
        \
        long[] tmpanswer = new long[nLength];\
        \
        for(int i = 0; i < nLength; i++)\{\
            tmpanswer[i] = n % 10;\
            n /= 10;\
        \}\
        \
        Arrays.sort(tmpanswer);\
        \
        for(int i = nLength -1; i >= 0; i--)\{\
            answer *= 10;\
            answer += tmpanswer[i];\
        \}\
        \
        return answer;\
    \}\
\}}