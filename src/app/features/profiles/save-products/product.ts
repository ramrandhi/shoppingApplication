export class Product {
    id: number = 0;
    company: string = '';
    model: string = '';
    description: string = '';
    price: number = 0;
    stockQuantity: number = 0;
    createdAt: Date = new Date;
    updatedAt: Date = new Date;
    category: string = '';
}