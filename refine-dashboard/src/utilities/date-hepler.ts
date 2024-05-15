import dayjs from "dayjs";

export const getDate = (startDate: string, endDate: string) => {
    const start = dayjs(startDate).format('MMM DD, YYYY - HH:mm');
    const end = dayjs(endDate).format('MMM DD, YYYY - HH:mm');

    return `${start} - ${end}`;
}
