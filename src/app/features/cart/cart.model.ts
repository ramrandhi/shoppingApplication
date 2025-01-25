export interface CartDTO {
    id: number;
    name: string;
    brand: string;
    model: string;
    color: string;
    description: string;
    oldPrice: number;
    price: number;
    stockQuantity: number;
    createdAt: string;
    updatedAt: string;
    category: string;
    imageLocation: string;
    type: string;
    orderNumber: string;
    productId: number;
    isSelected: boolean;
  }

  export class Cart {
    orderNumber: string| undefined;
    productId: number | undefined;
}
  