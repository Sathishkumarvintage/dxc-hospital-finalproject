export class User
{
    id!:number;
    fname!:string;
    phonenumber!:string;
    email!:string;
    password!:string;
}

export class Book
{
    bookid!:number;
    fullname!:string;
    mobilenumber!:string;
    email!:string;
    specialists!:string;
    doctor!:string;
    reason!:string;
    appointmentdate!:string;
    appointmenttime!:string;
    address!:string;
    status!:string;
}

export class Doctor{
    doctorId!:number;
    doctorname!:string;
    specialists!:string;

}