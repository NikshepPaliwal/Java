def Alert(P=15, Q=10):
    P= P*Q
    Q = P/Q
    print(P, "#", Q)
    return Q
A = 100
B = 200
A = Alert(A,B)
print(A, "$",B)
B= Alert(B)
print(A,"$",B)
A = Alert(A)
print(A, "$",B)