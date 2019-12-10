import java.util.*;
class Author
{
private String name;
private String email;
char gender;
Author(String n,String e,String g)
{
this.name=n;
this.email=e;
this.gender=g;
}
}
class Book extends Author
{
double price;
int qtyInStock;
Book(double p,int q)
{
this.price=p;
this.qtylnStock=q;
}
int getName()
{
return name;
}
int getAuthor()
{
return ;
}
void setPrice(){ }
int getPrice(){ return price;}

}