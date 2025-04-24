import { NextRequest, NextResponse } from 'next/server';

type Question = {
  id: string;
  question: string;
  yes: number;
  no: number;
};

// Mock DB (in-memory)
const mockDB: Record<string, Question> = {
  '1': {
    id: '1',
    question: 'Do you stand for Jamie?',
    yes: 3,
    no: 1,
  },
};

// GET: /api/questions/1
export async function GET(
    req: NextRequest,
    { params }: { params: { id: string } }
) {
  const question = mockDB[params.id];
  if (!question) {
    return NextResponse.json({ error: 'Not found' }, { status: 404 });
  }

  return NextResponse.json(question);
}

// POST: /api/questions/1/vote
export async function POST(
    req: NextRequest,
    { params }: { params: { id: string } }
) {
  const body = await req.json();
  const { vote } = body;

  const question = mockDB[params.id];
  if (!question || (vote !== 'YES' && vote !== 'NO')) {
    return NextResponse.json({ error: 'Invalid request' }, { status: 400 });
  }

  if (vote === 'YES') {
    question.yes += 1;
  } else {
    question.no += 1;
  }

  return NextResponse.json({ yes: question.yes, no: question.no });
}
